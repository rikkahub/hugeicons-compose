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

val HugeIcons.IdentityCardCheck: ImageVector
    get() {
        if (_identityCardCheck != null) {
            return _identityCardCheck!!
        }
        _identityCardCheck = ImageVector.Builder(
            name = "IdentityCardCheck",
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
            moveTo(22f, 12f)
            verticalLineTo(11.5f)
            curveTo(22f, 7.72876f, 22f, 5.84315f, 20.8284f, 4.67157f)
            curveTo(19.6569f, 3.5f, 17.7712f, 3.5f, 14f, 3.5f)
            horizontalLineTo(10f)
            curveTo(6.22876f, 3.5f, 4.34315f, 3.5f, 3.17157f, 4.67157f)
            curveTo(2f, 5.84315f, 2f, 7.72876f, 2f, 11.5f)
            verticalLineTo(12.5f)
            curveTo(2f, 16.2712f, 2f, 18.1569f, 3.17157f, 19.3284f)
            curveTo(4.34315f, 20.5f, 6.22876f, 20.5f, 10f, 20.5f)
            horizontalLineTo(12f)
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
            moveTo(5.5f, 16f)
            curveTo(6.53569f, 13.4189f, 10.3962f, 13.2491f, 11.5f, 16f)
            moveTo(10.25f, 9.75f)
            curveTo(10.25f, 10.7165f, 9.4665f, 11.5f, 8.5f, 11.5f)
            curveTo(7.5335f, 11.5f, 6.75f, 10.7165f, 6.75f, 9.75f)
            curveTo(6.75f, 8.7835f, 7.5335f, 8f, 8.5f, 8f)
            curveTo(9.4665f, 8f, 10.25f, 8.7835f, 10.25f, 9.75f)
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
            moveTo(14f, 8.5f)
            horizontalLineTo(18.5f)
            moveTo(14f, 12f)
            horizontalLineTo(18.5f)
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
            moveTo(15f, 18.4167f)
            curveTo(15f, 18.4167f, 15.875f, 18.8333f, 16.75f, 20.5f)
            curveTo(16.75f, 20.5f, 19.5294f, 16.3333f, 22f, 15.5f)
        }
        }.build()

        return _identityCardCheck!!
    }

private var _identityCardCheck: ImageVector? = null
