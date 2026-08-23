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

val HugeIcons.PhoneShake: ImageVector
    get() {
        if (_phoneShake != null) {
            return _phoneShake!!
        }
        _phoneShake = ImageVector.Builder(
            name = "PhoneShake",
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
            moveTo(8f, 3f)
            lineTo(3f, 8f)
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
            moveTo(21f, 16f)
            lineTo(16f, 21f)
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
            moveTo(3.88388f, 12.1161f)
            lineTo(12.1161f, 3.88388f)
            curveTo(12.6821f, 3.31794f, 13.4496f, 3f, 14.25f, 3f)
            curveTo(15.0504f, 3f, 15.8179f, 3.31794f, 16.3839f, 3.88388f)
            lineTo(20.1161f, 7.61612f)
            curveTo(20.6821f, 8.18206f, 21f, 8.94964f, 21f, 9.75f)
            curveTo(21f, 10.5504f, 20.6821f, 11.3179f, 20.1161f, 11.8839f)
            lineTo(11.8839f, 20.1161f)
            curveTo(11.3179f, 20.6821f, 10.5504f, 21f, 9.75f, 21f)
            curveTo(8.94964f, 21f, 8.18206f, 20.6821f, 7.61612f, 20.1161f)
            lineTo(3.88388f, 16.3839f)
            curveTo(3.31794f, 15.8179f, 3f, 15.0504f, 3f, 14.25f)
            curveTo(3f, 13.4496f, 3.31794f, 12.6821f, 3.88388f, 12.1161f)
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
            moveTo(7.25f, 15.75f)
            lineTo(8.24999f, 16.75f)
        }
        }.build()

        return _phoneShake!!
    }

private var _phoneShake: ImageVector? = null
