package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mouse16: ImageVector
    get() {
        if (_mouse16 != null) {
            return _mouse16!!
        }
        _mouse16 = ImageVector.Builder(
            name = "Mouse16",
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
        curveTo(17.2f, 22f, 18.5f, 18.392f, 18.5f, 14f)
        curveTo(18.5f, 9.60799f, 17.2f, 6f, 12f, 6f)
        curveTo(6.79994f, 6f, 5.5f, 9.60797f, 5.5f, 14f)
        curveTo(5.5f, 18.392f, 6.79994f, 22f, 12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 2f)
        curveTo(6f, 3.80215f, 7.74439f, 3.5f, 9.00657f, 3.5f)
        curveTo(11.0476f, 3.5f, 11.9337f, 3.87677f, 12f, 6f)
        verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 10.5f)
        curveTo(10.5f, 10.0341f, 10.5f, 9.80109f, 10.5761f, 9.61732f)
        curveTo(10.6776f, 9.37229f, 10.8723f, 9.17761f, 11.1173f, 9.07612f)
        curveTo(11.3011f, 9f, 11.5341f, 9f, 12f, 9f)
        curveTo(12.4659f, 9f, 12.6989f, 9f, 12.8827f, 9.07612f)
        curveTo(13.1277f, 9.17761f, 13.3224f, 9.37229f, 13.4239f, 9.61732f)
        curveTo(13.5f, 9.80109f, 13.5f, 10.0341f, 13.5f, 10.5f)
        verticalLineTo(11.5f)
        curveTo(13.5f, 11.9659f, 13.5f, 12.1989f, 13.4239f, 12.3827f)
        curveTo(13.3224f, 12.6277f, 13.1277f, 12.8224f, 12.8827f, 12.9239f)
        curveTo(12.6989f, 13f, 12.4659f, 13f, 12f, 13f)
        curveTo(11.5341f, 13f, 11.3011f, 13f, 11.1173f, 12.9239f)
        curveTo(10.8723f, 12.8224f, 10.6776f, 12.6277f, 10.5761f, 12.3827f)
        curveTo(10.5f, 12.1989f, 10.5f, 11.9659f, 10.5f, 11.5f)
        verticalLineTo(10.5f)
        }
        }.build()

        return _mouse16!!
    }

private var _mouse16: ImageVector? = null
