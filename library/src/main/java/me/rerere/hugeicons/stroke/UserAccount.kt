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

val HugeIcons.UserAccount: ImageVector
    get() {
        if (_userAccount != null) {
            return _userAccount!!
        }
        _userAccount = ImageVector.Builder(
            name = "UserAccount",
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
            moveTo(2f, 12f)
            curveTo(2f, 8.22876f, 2f, 6.34315f, 3.11299f, 5.17157f)
            curveTo(4.22599f, 4f, 6.01733f, 4f, 9.6f, 4f)
            lineTo(14.4f, 4f)
            curveTo(17.9827f, 4f, 19.774f, 4f, 20.887f, 5.17157f)
            curveTo(22f, 6.34315f, 22f, 8.22876f, 22f, 12f)
            curveTo(22f, 15.7712f, 22f, 17.6569f, 20.887f, 18.8284f)
            curveTo(19.774f, 20f, 17.9827f, 20f, 14.4f, 20f)
            horizontalLineTo(9.6f)
            curveTo(6.01733f, 20f, 4.22599f, 20f, 3.11299f, 18.8284f)
            curveTo(2f, 17.6569f, 2f, 15.7712f, 2f, 12f)
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
            moveTo(12.5002f, 16.4998f)
            curveTo(12.3747f, 14.9008f, 11.0691f, 13.6349f, 9.43556f, 13.5282f)
            lineTo(9.00024f, 13.4998f)
            curveTo(8.84474f, 13.5039f, 8.69983f, 13.5094f, 8.5631f, 13.516f)
            curveTo(6.94399f, 13.5938f, 5.62457f, 14.9165f, 5.50024f, 16.4998f)
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
            moveTo(10.75f, 9.25f)
            curveTo(10.75f, 10.2165f, 9.9665f, 11f, 9f, 11f)
            curveTo(8.0335f, 11f, 7.25f, 10.2165f, 7.25f, 9.25f)
            curveTo(7.25f, 8.2835f, 8.0335f, 7.5f, 9f, 7.5f)
            curveTo(9.9665f, 7.5f, 10.75f, 8.2835f, 10.75f, 9.25f)
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
            moveTo(14.5f, 8.99927f)
            lineTo(18.5f, 9.00001f)
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
            moveTo(14.5f, 12.4993f)
            lineTo(18.5f, 12.5f)
        }
        }.build()

        return _userAccount!!
    }

private var _userAccount: ImageVector? = null
