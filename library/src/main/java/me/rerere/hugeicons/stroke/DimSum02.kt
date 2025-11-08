package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DimSum02: ImageVector
    get() {
        if (_dimSum02 != null) {
            return _dimSum02!!
        }
        _dimSum02 = ImageVector.Builder(
            name = "DimSum02",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 11.5f)
        lineTo(7f, 12.5f)
        moveTo(10.5f, 11.5f)
        lineTo(11f, 12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 6.5f)
        lineTo(17f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 22f)
        curveTo(12.866f, 22f, 16f, 19.3137f, 16f, 16f)
        curveTo(16f, 14.5985f, 15.4394f, 13.1304f, 14.5f, 11.9028f)
        curveTo(12.5622f, 9.57474f, 12.0035f, 7.80237f, 12f, 7f)
        curveTo(11.9412f, 8.60728f, 9.9849f, 9.47735f, 9f, 8f)
        curveTo(8.0151f, 9.47735f, 6.05882f, 8.60728f, 6f, 7f)
        curveTo(5.99651f, 7.80237f, 5.43778f, 9.57474f, 3.5f, 11.9028f)
        curveTo(2.56057f, 13.1304f, 2f, 14.5985f, 2f, 16f)
        curveTo(2f, 19.3137f, 5.13401f, 22f, 9f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 5.01625f)
        curveTo(11.8344f, 3.62313f, 12.11f, 2.56899f, 12.1124f, 2f)
        curveTo(12.1706f, 3.61599f, 14.1049f, 4.49076f, 15.0787f, 3.00542f)
        curveTo(16.0525f, 4.49076f, 17.9868f, 3.61599f, 18.045f, 2f)
        curveTo(18.0484f, 2.80672f, 18.6009f, 4.58869f, 20.5169f, 6.9293f)
        curveTo(21.4457f, 8.16365f, 22f, 9.6397f, 22f, 11.0487f)
        curveTo(22f, 13.0987f, 20.8268f, 14.9099f, 19.0337f, 16f)
        }
        }.build()

        return _dimSum02!!
    }

private var _dimSum02: ImageVector? = null
