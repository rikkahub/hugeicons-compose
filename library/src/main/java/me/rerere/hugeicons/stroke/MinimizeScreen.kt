package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MinimizeScreen: ImageVector
    get() {
        if (_minimizeScreen != null) {
            return _minimizeScreen!!
        }
        _minimizeScreen = ImageVector.Builder(
            name = "MinimizeScreen",
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
        moveTo(11.4333f, 16.0659f)
        lineTo(8.6912f, 15.9658f)
        curveTo(8.28365f, 15.951f, 7.96094f, 15.6163f, 7.96094f, 15.2084f)
        lineTo(7.96094f, 12.5936f)
        moveTo(13.4609f, 10.5659f)
        lineTo(8.41716f, 15.5843f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 7f)
        curveTo(22f, 8.8856f, 22f, 9.8284f, 21.4142f, 10.4142f)
        curveTo(20.8284f, 11f, 19.8856f, 11f, 18f, 11f)
        horizontalLineTo(17f)
        curveTo(15.1144f, 11f, 14.1716f, 11f, 13.5858f, 10.4142f)
        curveTo(13f, 9.8284f, 13f, 8.8856f, 13f, 7f)
        lineTo(13f, 6f)
        curveTo(13f, 4.1144f, 13f, 3.1716f, 13.5858f, 2.5858f)
        curveTo(14.1716f, 2f, 15.1144f, 2f, 17f, 2f)
        lineTo(18f, 2f)
        curveTo(19.8856f, 2f, 20.8284f, 2f, 21.4142f, 2.5858f)
        curveTo(22f, 3.1716f, 22f, 4.1144f, 22f, 6f)
        verticalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 15.5f)
        verticalLineTo(13.5f)
        moveTo(10f, 22f)
        horizontalLineTo(14f)
        moveTo(2f, 10f)
        lineTo(2f, 14f)
        moveTo(10.5f, 2f)
        lineTo(8.5f, 2f)
        moveTo(21.9401f, 18.5f)
        curveTo(21.7861f, 19.5656f, 21.4865f, 20.321f, 20.9037f, 20.9038f)
        curveTo(20.321f, 21.4865f, 19.5656f, 21.7861f, 18.5f, 21.9401f)
        moveTo(5.5f, 21.9401f)
        curveTo(4.4344f, 21.7861f, 3.679f, 21.4865f, 3.0963f, 20.9037f)
        curveTo(2.5135f, 20.321f, 2.2139f, 19.5656f, 2.0599f, 18.5f)
        moveTo(2.0599f, 5.5f)
        curveTo(2.2139f, 4.4344f, 2.5135f, 3.679f, 3.0963f, 3.0963f)
        curveTo(3.679f, 2.5135f, 4.4344f, 2.2139f, 5.5f, 2.0599f)
        }
        }.build()

        return _minimizeScreen!!
    }

private var _minimizeScreen: ImageVector? = null
