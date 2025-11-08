package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DressingTable02: ImageVector
    get() {
        if (_dressingTable02 != null) {
            return _dressingTable02!!
        }
        _dressingTable02 = ImageVector.Builder(
            name = "DressingTable02",
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
        moveTo(19f, 16f)
        curveTo(19.5f, 16.3333f, 20.3f, 17.4f, 19.5f, 19f)
        curveTo(18.7f, 20.6f, 19.5f, 21.6667f, 20f, 22f)
        moveTo(19f, 16f)
        horizontalLineTo(5f)
        moveTo(19f, 16f)
        verticalLineTo(13f)
        moveTo(5f, 16f)
        curveTo(4.5f, 16.3333f, 3.7f, 17.4f, 4.5f, 19f)
        curveTo(5.3f, 20.6f, 4.5f, 21.6667f, 4f, 22f)
        moveTo(5f, 16f)
        verticalLineTo(13f)
        moveTo(20f, 13f)
        horizontalLineTo(19f)
        moveTo(4f, 13f)
        horizontalLineTo(5f)
        moveTo(19f, 13f)
        horizontalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 7.5f)
        curveTo(7f, 10.5376f, 9.23857f, 13f, 12f, 13f)
        curveTo(14.7614f, 13f, 17f, 10.5376f, 17f, 7.5f)
        curveTo(17f, 4.46243f, 14.7614f, 2f, 12f, 2f)
        curveTo(9.23858f, 2f, 7f, 4.46243f, 7f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 7f)
        lineTo(12.5f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 9.5f)
        lineTo(13f, 8f)
        }
        }.build()

        return _dressingTable02!!
    }

private var _dressingTable02: ImageVector? = null
