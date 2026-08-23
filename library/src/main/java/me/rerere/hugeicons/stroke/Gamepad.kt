package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Gamepad: ImageVector
    get() {
        if (_gamepad != null) {
            return _gamepad!!
        }
        _gamepad = ImageVector.Builder(
            name = "Gamepad",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8f, 18f)
            horizontalLineTo(16f)
            curveTo(19.3137f, 18f, 22f, 15.3137f, 22f, 12f)
            curveTo(22f, 8.68629f, 19.3137f, 6f, 16f, 6f)
            horizontalLineTo(8f)
            curveTo(4.68629f, 6f, 2f, 8.68629f, 2f, 12f)
            curveTo(2f, 15.3137f, 4.68629f, 18f, 8f, 18f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(7.995f, 10f)
            verticalLineTo(14f)
            moveTo(10f, 11.995f)
            lineTo(6f, 11.995f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(17.75f, 10.6191f)
            verticalLineTo(10.7441f)
            moveTo(18f, 10.7441f)
            curveTo(18f, 10.8822f, 17.8881f, 10.9941f, 17.75f, 10.9941f)
            curveTo(17.6119f, 10.9941f, 17.5f, 10.8822f, 17.5f, 10.7441f)
            curveTo(17.5f, 10.6061f, 17.6119f, 10.4941f, 17.75f, 10.4941f)
            curveTo(17.8881f, 10.4941f, 18f, 10.6061f, 18f, 10.7441f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(15.25f, 13.1191f)
            verticalLineTo(13.2441f)
            moveTo(15.5f, 13.2441f)
            curveTo(15.5f, 13.3822f, 15.3881f, 13.4941f, 15.25f, 13.4941f)
            curveTo(15.1119f, 13.4941f, 15f, 13.3822f, 15f, 13.2441f)
            curveTo(15f, 13.1061f, 15.1119f, 12.9941f, 15.25f, 12.9941f)
            curveTo(15.3881f, 12.9941f, 15.5f, 13.1061f, 15.5f, 13.2441f)
            close()
        }
        }.build()

        return _gamepad!!
    }

private var _gamepad: ImageVector? = null
