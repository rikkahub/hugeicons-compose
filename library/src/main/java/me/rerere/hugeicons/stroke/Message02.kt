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

val HugeIcons.Message02: ImageVector
    get() {
        if (_message02 != null) {
            return _message02!!
        }
        _message02 = ImageVector.Builder(
            name = "Message02",
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
            moveTo(12f, 20.5f)
            curveTo(19.1328f, 20.5f, 22f, 16.4706f, 22f, 11.5f)
            curveTo(22f, 6.52944f, 20.1328f, 2.5f, 12f, 2.5f)
            curveTo(4.13281f, 2.5f, 2f, 6.52944f, 2f, 11.5f)
            curveTo(2f, 13.5712f, 2.37034f, 15.4791f, 3.37161f, 17f)
            curveTo(4.63281f, 19f, 3.99253f, 20.8333f, 3f, 21.5f)
            curveTo(4.61547f, 21.5f, 5.70211f, 20.9858f, 6.39239f, 20.4766f)
            curveTo(6.88252f, 20.115f, 7.50688f, 19.9364f, 8.0984f, 20.0815f)
            curveTo(9.20689f, 20.3533f, 10.4991f, 20.5f, 12f, 20.5f)
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
            moveTo(12.1248f, 11.5f)
            horizontalLineTo(11.9998f)
            moveTo(16.125f, 11.5f)
            horizontalLineTo(16f)
            moveTo(8.125f, 11.5f)
            horizontalLineTo(8f)
            moveTo(12.2498f, 11.5f)
            curveTo(12.2498f, 11.6381f, 12.1379f, 11.75f, 11.9998f, 11.75f)
            curveTo(11.8618f, 11.75f, 11.7498f, 11.6381f, 11.7498f, 11.5f)
            curveTo(11.7498f, 11.3619f, 11.8618f, 11.25f, 11.9998f, 11.25f)
            curveTo(12.1379f, 11.25f, 12.2498f, 11.3619f, 12.2498f, 11.5f)
            close()
            moveTo(16.25f, 11.5f)
            curveTo(16.25f, 11.6381f, 16.1381f, 11.75f, 16f, 11.75f)
            curveTo(15.8619f, 11.75f, 15.75f, 11.6381f, 15.75f, 11.5f)
            curveTo(15.75f, 11.3619f, 15.8619f, 11.25f, 16f, 11.25f)
            curveTo(16.1381f, 11.25f, 16.25f, 11.3619f, 16.25f, 11.5f)
            close()
            moveTo(8.25f, 11.5f)
            curveTo(8.25f, 11.6381f, 8.13807f, 11.75f, 8f, 11.75f)
            curveTo(7.86193f, 11.75f, 7.75f, 11.6381f, 7.75f, 11.5f)
            curveTo(7.75f, 11.3619f, 7.86193f, 11.25f, 8f, 11.25f)
            curveTo(8.13807f, 11.25f, 8.25f, 11.3619f, 8.25f, 11.5f)
            close()
        }
        }.build()

        return _message02!!
    }

private var _message02: ImageVector? = null
