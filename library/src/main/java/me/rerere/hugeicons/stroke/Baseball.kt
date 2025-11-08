package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Baseball: ImageVector
    get() {
        if (_baseball != null) {
            return _baseball!!
        }
        _baseball = ImageVector.Builder(
            name = "Baseball",
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
        moveTo(22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 22f)
        curveTo(12f, 21.8136f, 11.9949f, 21.6285f, 11.9848f, 21.4446f)
        moveTo(2f, 12f)
        curveTo(2.2062f, 12f, 2.41094f, 12.0062f, 2.61405f, 12.0185f)
        moveTo(5.34028f, 12.5715f)
        curveTo(5.67469f, 12.69f, 6.00092f, 12.8257f, 6.3179f, 12.9777f)
        moveTo(8.68574f, 14.5634f)
        curveTo(8.94563f, 14.7972f, 9.1932f, 15.0445f, 9.42736f, 15.304f)
        moveTo(11.0417f, 17.7227f)
        curveTo(11.181f, 18.0168f, 11.3065f, 18.3188f, 11.4172f, 18.6278f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        curveTo(12f, 2.18635f, 12.0051f, 2.37152f, 12.0152f, 2.55535f)
        moveTo(22f, 12f)
        curveTo(21.7938f, 12f, 21.5891f, 11.9938f, 21.3859f, 11.9815f)
        moveTo(18.6597f, 11.4285f)
        curveTo(18.3253f, 11.31f, 17.9991f, 11.1743f, 17.6821f, 11.0223f)
        moveTo(15.3143f, 9.43657f)
        curveTo(15.0544f, 9.20277f, 14.8068f, 8.95554f, 14.5726f, 8.69597f)
        moveTo(12.9583f, 6.27732f)
        curveTo(12.819f, 5.98322f, 12.6935f, 5.68123f, 12.5828f, 5.3722f)
        }
        }.build()

        return _baseball!!
    }

private var _baseball: ImageVector? = null
