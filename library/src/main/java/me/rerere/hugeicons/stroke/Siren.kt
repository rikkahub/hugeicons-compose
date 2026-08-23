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

val HugeIcons.Siren: ImageVector
    get() {
        if (_siren != null) {
            return _siren!!
        }
        _siren = ImageVector.Builder(
            name = "Siren",
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
            moveTo(4.99219f, 17f)
            verticalLineTo(10f)
            curveTo(4.99219f, 6.13401f, 8.12619f, 3f, 11.9922f, 3f)
            curveTo(15.8582f, 3f, 18.9922f, 6.13401f, 18.9922f, 10f)
            verticalLineTo(17f)
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
            moveTo(11.4922f, 6.5f)
            curveTo(9.83533f, 6.5f, 8.49219f, 7.84315f, 8.49219f, 9.5f)
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
            moveTo(2.99219f, 19f)
            curveTo(2.99219f, 17.8954f, 3.88762f, 17f, 4.99219f, 17f)
            horizontalLineTo(18.9922f)
            curveTo(20.0968f, 17f, 20.9922f, 17.8954f, 20.9922f, 19f)
            curveTo(20.9922f, 20.1046f, 20.0968f, 21f, 18.9922f, 21f)
            horizontalLineTo(4.99219f)
            curveTo(3.88762f, 21f, 2.99219f, 20.1046f, 2.99219f, 19f)
            close()
        }
        }.build()

        return _siren!!
    }

private var _siren: ImageVector? = null
