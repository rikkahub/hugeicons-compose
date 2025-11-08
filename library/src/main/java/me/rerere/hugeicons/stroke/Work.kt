package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Work: ImageVector
    get() {
        if (_work != null) {
            return _work!!
        }
        _work = ImageVector.Builder(
            name = "Work",
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
        moveTo(2f, 14f)
        curveTo(2f, 11.1911f, 2f, 9.78661f, 2.67412f, 8.77772f)
        curveTo(2.96596f, 8.34096f, 3.34096f, 7.96596f, 3.77772f, 7.67412f)
        curveTo(4.78661f, 7f, 6.19108f, 7f, 9f, 7f)
        horizontalLineTo(15f)
        curveTo(17.8089f, 7f, 19.2134f, 7f, 20.2223f, 7.67412f)
        curveTo(20.659f, 7.96596f, 21.034f, 8.34096f, 21.3259f, 8.77772f)
        curveTo(22f, 9.78661f, 22f, 11.1911f, 22f, 14f)
        curveTo(22f, 16.8089f, 22f, 18.2134f, 21.3259f, 19.2223f)
        curveTo(21.034f, 19.659f, 20.659f, 20.034f, 20.2223f, 20.3259f)
        curveTo(19.2134f, 21f, 17.8089f, 21f, 15f, 21f)
        horizontalLineTo(9f)
        curveTo(6.19108f, 21f, 4.78661f, 21f, 3.77772f, 20.3259f)
        curveTo(3.34096f, 20.034f, 2.96596f, 19.659f, 2.67412f, 19.2223f)
        curveTo(2f, 18.2134f, 2f, 16.8089f, 2f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 7f)
        curveTo(16f, 5.11438f, 16f, 4.17157f, 15.4142f, 3.58579f)
        curveTo(14.8284f, 3f, 13.8856f, 3f, 12f, 3f)
        curveTo(10.1144f, 3f, 9.17157f, 3f, 8.58579f, 3.58579f)
        curveTo(8f, 4.17157f, 8f, 5.11438f, 8f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 11f)
        lineTo(6.65197f, 11.202f)
        curveTo(10.0851f, 12.266f, 13.9149f, 12.266f, 17.348f, 11.202f)
        lineTo(18f, 11f)
        moveTo(12f, 12f)
        verticalLineTo(14f)
        }
        }.build()

        return _work!!
    }

private var _work: ImageVector? = null
