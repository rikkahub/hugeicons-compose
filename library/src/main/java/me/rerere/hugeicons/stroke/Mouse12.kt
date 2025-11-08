package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mouse12: ImageVector
    get() {
        if (_mouse12 != null) {
            return _mouse12!!
        }
        _mouse12 = ImageVector.Builder(
            name = "Mouse12",
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
        moveTo(12f, 22f)
        curveTo(17.6f, 22f, 19f, 18.1665f, 19f, 13.5f)
        curveTo(19f, 8.83348f, 17.6f, 5f, 12f, 5f)
        curveTo(6.39994f, 5f, 5f, 8.83346f, 5f, 13.5f)
        curveTo(5f, 18.1665f, 6.39994f, 22f, 12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 8f)
        verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 9.5f)
        curveTo(10.5f, 9.03406f, 10.5f, 8.80109f, 10.5761f, 8.61732f)
        curveTo(10.6776f, 8.37229f, 10.8723f, 8.17761f, 11.1173f, 8.07612f)
        curveTo(11.3011f, 8f, 11.5341f, 8f, 12f, 8f)
        curveTo(12.4659f, 8f, 12.6989f, 8f, 12.8827f, 8.07612f)
        curveTo(13.1277f, 8.17761f, 13.3224f, 8.37229f, 13.4239f, 8.61732f)
        curveTo(13.5f, 8.80109f, 13.5f, 9.03406f, 13.5f, 9.5f)
        verticalLineTo(10.5f)
        curveTo(13.5f, 10.9659f, 13.5f, 11.1989f, 13.4239f, 11.3827f)
        curveTo(13.3224f, 11.6277f, 13.1277f, 11.8224f, 12.8827f, 11.9239f)
        curveTo(12.6989f, 12f, 12.4659f, 12f, 12f, 12f)
        curveTo(11.5341f, 12f, 11.3011f, 12f, 11.1173f, 11.9239f)
        curveTo(10.8723f, 11.8224f, 10.6776f, 11.6277f, 10.5761f, 11.3827f)
        curveTo(10.5f, 11.1989f, 10.5f, 10.9659f, 10.5f, 10.5f)
        verticalLineTo(9.5f)
        }
        }.build()

        return _mouse12!!
    }

private var _mouse12: ImageVector? = null
