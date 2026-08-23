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

val HugeIcons.UserLock01: ImageVector
    get() {
        if (_userLock01 != null) {
            return _userLock01!!
        }
        _userLock01 = ImageVector.Builder(
            name = "UserLock01",
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
            moveTo(11.993f, 13.5646f)
            lineTo(10.998f, 13.4983f)
            curveTo(10.6426f, 13.508f, 10.3113f, 13.5209f, 9.99881f, 13.5362f)
            curveTo(6.29798f, 13.7176f, 3.28216f, 16.8041f, 2.99799f, 20.4985f)
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
            moveTo(19.498f, 16.9983f)
            verticalLineTo(15.4983f)
            curveTo(19.498f, 14.3937f, 18.6026f, 13.4983f, 17.498f, 13.4983f)
            curveTo(16.3934f, 13.4983f, 15.498f, 14.3937f, 15.498f, 15.4983f)
            verticalLineTo(16.9983f)
            moveTo(19.498f, 16.9983f)
            horizontalLineTo(19.998f)
            curveTo(20.5503f, 16.9983f, 20.998f, 17.446f, 20.998f, 17.9983f)
            verticalLineTo(20.4983f)
            curveTo(20.998f, 21.0506f, 20.5503f, 21.4983f, 19.998f, 21.4983f)
            horizontalLineTo(14.998f)
            curveTo(14.4457f, 21.4983f, 13.998f, 21.0506f, 13.998f, 20.4983f)
            verticalLineTo(17.9983f)
            curveTo(13.998f, 17.446f, 14.4457f, 16.9983f, 14.998f, 16.9983f)
            horizontalLineTo(15.498f)
            moveTo(19.498f, 16.9983f)
            horizontalLineTo(15.498f)
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
            moveTo(14.998f, 6.49829f)
            arcTo(4f, 4f, 0f, true, false, 6.997999999999999f, 6.49829f)
            arcTo(4f, 4f, 0f, true, false, 14.998f, 6.49829f)
            close()
        }
        }.build()

        return _userLock01!!
    }

private var _userLock01: ImageVector? = null
