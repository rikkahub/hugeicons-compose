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

val HugeIcons.AiCamera: ImageVector
    get() {
        if (_aiCamera != null) {
            return _aiCamera!!
        }
        _aiCamera = ImageVector.Builder(
            name = "AiCamera",
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
            moveTo(13f, 4f)
            horizontalLineTo(12.2042f)
            curveTo(11.1323f, 4f, 10.5964f, 4f, 10.1157f, 4.168f)
            curveTo(9.8222f, 4.27059f, 9.54642f, 4.41818f, 9.29824f, 4.6055f)
            curveTo(8.89184f, 4.91224f, 8.59456f, 5.35816f, 8f, 6.25f)
            lineTo(7.90463f, 6.39305f)
            curveTo(7.79972f, 6.55042f, 7.74726f, 6.62911f, 7.68524f, 6.69354f)
            curveTo(7.53932f, 6.84511f, 7.34931f, 6.9468f, 7.14225f, 6.98413f)
            curveTo(7.05424f, 7f, 6.95968f, 7f, 6.77054f, 7f)
            curveTo(5.58861f, 7f, 4.99765f, 7f, 4.51559f, 7.14129f)
            curveTo(3.3714f, 7.47664f, 2.47664f, 8.3714f, 2.14129f, 9.51559f)
            curveTo(2f, 9.99765f, 2f, 10.5886f, 2f, 11.7705f)
            verticalLineTo(14f)
            curveTo(2f, 17.2998f, 2f, 18.9497f, 3.02513f, 19.9749f)
            curveTo(4.05025f, 21f, 5.70017f, 21f, 9f, 21f)
            horizontalLineTo(15f)
            curveTo(18.2998f, 21f, 19.9497f, 21f, 20.9749f, 19.9749f)
            curveTo(22f, 18.9497f, 22f, 17.2998f, 22f, 14f)
            verticalLineTo(9f)
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
            moveTo(15.5f, 13.5f)
            curveTo(15.5f, 15.433f, 13.933f, 17f, 12f, 17f)
            curveTo(10.067f, 17f, 8.5f, 15.433f, 8.5f, 13.5f)
            curveTo(8.5f, 11.567f, 10.067f, 10f, 12f, 10f)
            curveTo(13.933f, 10f, 15.5f, 11.567f, 15.5f, 13.5f)
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
            moveTo(18.5f, 3.9375f)
            verticalLineTo(5.5f)
            moveTo(18.5f, 5.5f)
            verticalLineTo(7.0625f)
            moveTo(18.5f, 5.5f)
            horizontalLineTo(17.25f)
            moveTo(18.5f, 5.5f)
            horizontalLineTo(19.75f)
            moveTo(21f, 5.5f)
            lineTo(19.9156f, 5.13852f)
            curveTo(19.4179f, 4.97263f, 19.0274f, 4.58211f, 18.8615f, 4.08443f)
            lineTo(18.5f, 3f)
            lineTo(18.1385f, 4.08443f)
            curveTo(17.9726f, 4.58211f, 17.5821f, 4.97263f, 17.0844f, 5.13852f)
            lineTo(16f, 5.5f)
            lineTo(17.0844f, 5.86148f)
            curveTo(17.5821f, 6.02737f, 17.9726f, 6.41789f, 18.1385f, 6.91557f)
            lineTo(18.5f, 8f)
            lineTo(18.8615f, 6.91557f)
            curveTo(19.0274f, 6.41789f, 19.4179f, 6.02737f, 19.9156f, 5.86148f)
            lineTo(21f, 5.5f)
            close()
        }
        }.build()

        return _aiCamera!!
    }

private var _aiCamera: ImageVector? = null
