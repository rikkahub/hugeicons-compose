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

val HugeIcons.Gamepad01: ImageVector
    get() {
        if (_gamepad01 != null) {
            return _gamepad01!!
        }
        _gamepad01 = ImageVector.Builder(
            name = "Gamepad01",
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
            moveTo(17.25f, 8.625f)
            verticalLineTo(8.75f)
            moveTo(17.5f, 8.75f)
            curveTo(17.5f, 8.88807f, 17.3881f, 9f, 17.25f, 9f)
            curveTo(17.1119f, 9f, 17f, 8.88807f, 17f, 8.75f)
            curveTo(17f, 8.61193f, 17.1119f, 8.5f, 17.25f, 8.5f)
            curveTo(17.3881f, 8.5f, 17.5f, 8.61193f, 17.5f, 8.75f)
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
            moveTo(14.75f, 11.125f)
            verticalLineTo(11.25f)
            moveTo(15f, 11.25f)
            curveTo(15f, 11.3881f, 14.8881f, 11.5f, 14.75f, 11.5f)
            curveTo(14.6119f, 11.5f, 14.5f, 11.3881f, 14.5f, 11.25f)
            curveTo(14.5f, 11.1119f, 14.6119f, 11f, 14.75f, 11f)
            curveTo(14.8881f, 11f, 15f, 11.1119f, 15f, 11.25f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(6.70656f, 5f)
            curveTo(6.23175f, 5f, 5.99435f, 5f, 5.68026f, 5.10719f)
            curveTo(5.36618f, 5.21437f, 5.25033f, 5.30387f, 5.01863f, 5.48285f)
            curveTo(2.35168f, 7.54307f, 0.760603f, 13.0769f, 3.22501f, 17.5247f)
            curveTo(3.77421f, 18.5159f, 4.8889f, 19f, 6.02209f, 19f)
            curveTo(7.21182f, 19f, 8.27675f, 18.262f, 8.69449f, 17.148f)
            lineTo(9.125f, 16f)
            curveTo(9.25151f, 15.6626f, 9.31476f, 15.494f, 9.41966f, 15.366f)
            curveTo(9.53796f, 15.2217f, 9.69427f, 15.1134f, 9.87092f, 15.0533f)
            curveTo(10.0276f, 15f, 10.2077f, 15f, 10.568f, 15f)
            horizontalLineTo(13.432f)
            curveTo(13.7923f, 15f, 13.9724f, 15f, 14.1291f, 15.0533f)
            curveTo(14.3057f, 15.1134f, 14.462f, 15.2217f, 14.5803f, 15.366f)
            curveTo(14.6852f, 15.494f, 14.7485f, 15.6626f, 14.875f, 16f)
            lineTo(15.3056f, 17.1482f)
            curveTo(15.7233f, 18.2621f, 16.7881f, 19f, 17.9777f, 19f)
            curveTo(19.1108f, 19f, 20.2254f, 18.5159f, 20.7746f, 17.5248f)
            curveTo(23.2393f, 13.077f, 21.6489f, 7.54311f, 18.9821f, 5.48286f)
            curveTo(18.7504f, 5.30388f, 18.6346f, 5.21439f, 18.3205f, 5.10719f)
            curveTo(18.0064f, 5f, 17.769f, 5f, 17.2942f, 5f)
            horizontalLineTo(6.70656f)
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
            moveTo(7.995f, 8f)
            verticalLineTo(12f)
            moveTo(10f, 9.995f)
            lineTo(6f, 9.995f)
        }
        }.build()

        return _gamepad01!!
    }

private var _gamepad01: ImageVector? = null
