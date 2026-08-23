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

val HugeIcons.CardSim: ImageVector
    get() {
        if (_cardSim != null) {
            return _cardSim!!
        }
        _cardSim = ImageVector.Builder(
            name = "CardSim",
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
            moveTo(13f, 9.5f)
            horizontalLineTo(11f)
            curveTo(9.11438f, 9.5f, 8.17157f, 9.5f, 7.58579f, 10.0858f)
            curveTo(7f, 10.6716f, 7f, 11.6144f, 7f, 13.5f)
            verticalLineTo(14.5f)
            curveTo(7f, 16.3856f, 7f, 17.3284f, 7.58579f, 17.9142f)
            curveTo(8.17157f, 18.5f, 9.11438f, 18.5f, 11f, 18.5f)
            horizontalLineTo(13f)
            curveTo(14.8856f, 18.5f, 15.8284f, 18.5f, 16.4142f, 17.9142f)
            curveTo(17f, 17.3284f, 17f, 16.3856f, 17f, 14.5f)
            verticalLineTo(13.5f)
            curveTo(17f, 11.6144f, 17f, 10.6716f, 16.4142f, 10.0858f)
            curveTo(15.8284f, 9.5f, 14.8856f, 9.5f, 13f, 9.5f)
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
            moveTo(13.5f, 16f)
            lineTo(13.5f, 18f)
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
            moveTo(13.5f, 10f)
            lineTo(13.5f, 12f)
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
            moveTo(10.5f, 16f)
            lineTo(10.5f, 18f)
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
            moveTo(10.5f, 10f)
            lineTo(10.5f, 12f)
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
            moveTo(3f, 11.8584f)
            curveTo(3f, 7.28199f, 3f, 4.99376f, 4.38674f, 3.54394f)
            curveTo(4.43797f, 3.49038f, 4.49038f, 3.43797f, 4.54394f, 3.38674f)
            curveTo(5.99376f, 2f, 8.28199f, 2f, 12.8584f, 2f)
            curveTo(13.943f, 2f, 14.4655f, 2.00376f, 14.9628f, 2.18936f)
            curveTo(15.4417f, 2.3681f, 15.8429f, 2.70239f, 16.6452f, 3.37099f)
            lineTo(18.8411f, 5.20092f)
            curveTo(19.9027f, 6.08561f, 20.4335f, 6.52795f, 20.7168f, 7.13266f)
            curveTo(21f, 7.73737f, 21f, 8.42833f, 21f, 9.81025f)
            verticalLineTo(13f)
            curveTo(21f, 16.7497f, 21f, 18.6246f, 20.0451f, 19.9389f)
            curveTo(19.7367f, 20.3634f, 19.3634f, 20.7367f, 18.9389f, 21.0451f)
            curveTo(17.6246f, 22f, 15.7497f, 22f, 12f, 22f)
            curveTo(8.25027f, 22f, 6.3754f, 22f, 5.06107f, 21.0451f)
            curveTo(4.6366f, 20.7367f, 4.26331f, 20.3634f, 3.95491f, 19.9389f)
            curveTo(3f, 18.6246f, 3f, 16.7497f, 3f, 13f)
            verticalLineTo(11.8584f)
            close()
        }
        }.build()

        return _cardSim!!
    }

private var _cardSim: ImageVector? = null
