package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.KimiAi: ImageVector
    get() {
        if (_kimiAi != null) {
            return _kimiAi!!
        }
        _kimiAi = ImageVector.Builder(
            name = "KimiAi",
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
        moveTo(19.5f, 4.5f)
        horizontalLineTo(20.5f)
        moveTo(21f, 4.5f)
        curveTo(21f, 5.05228f, 20.5523f, 5.5f, 20f, 5.5f)
        horizontalLineTo(19f)
        verticalLineTo(4.5f)
        curveTo(19f, 3.94772f, 19.4477f, 3.5f, 20f, 3.5f)
        curveTo(20.5523f, 3.5f, 21f, 3.94772f, 21f, 4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 6f)
        horizontalLineTo(3f)
        verticalLineTo(20.5f)
        horizontalLineTo(5.5f)
        verticalLineTo(17f)
        lineTo(7.75574f, 14.7443f)
        lineTo(13.8256f, 19.5669f)
        curveTo(14.586f, 20.1711f, 15.5287f, 20.5f, 16.5f, 20.5f)
        verticalLineTo(17.5f)
        curveTo(15.8521f, 17.5f, 15.2228f, 17.283f, 14.7126f, 16.8836f)
        lineTo(9.61064f, 12.8894f)
        lineTo(16.5f, 6f)
        horizontalLineTo(13f)
        lineTo(5.5f, 13.5f)
        verticalLineTo(6f)
        }
        }.build()

        return _kimiAi!!
    }

private var _kimiAi: ImageVector? = null
