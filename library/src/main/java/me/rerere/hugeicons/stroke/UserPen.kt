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

val HugeIcons.UserPen: ImageVector
    get() {
        if (_userPen != null) {
            return _userPen!!
        }
        _userPen = ImageVector.Builder(
            name = "UserPen",
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
            moveTo(3.5f, 19f)
            verticalLineTo(16.9704f)
            curveTo(3.5f, 15.7281f, 4.05927f, 14.5099f, 5.18968f, 13.9946f)
            curveTo(6.5685f, 13.3661f, 8.22212f, 13f, 10f, 13f)
            curveTo(11.4418f, 13f, 12.8019f, 13.2407f, 14f, 13.667f)
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
            moveTo(13.5f, 6.5f)
            arcTo(3.5f, 3.5f, 0f, true, false, 6.5f, 6.5f)
            arcTo(3.5f, 3.5f, 0f, true, false, 13.5f, 6.5f)
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
            moveTo(20.1887f, 14.9339f)
            lineTo(19.5661f, 14.3113f)
            curveTo(19.151f, 13.8962f, 18.478f, 13.8962f, 18.0629f, 14.3113f)
            lineTo(14.7141f, 17.6601f)
            curveTo(14.269f, 18.1052f, 13.9656f, 18.6722f, 13.8421f, 19.2895f)
            lineTo(13.5f, 21f)
            lineTo(15.2105f, 20.6579f)
            curveTo(15.8278f, 20.5344f, 16.3948f, 20.231f, 16.8399f, 19.7859f)
            lineTo(20.1887f, 16.4371f)
            curveTo(20.6038f, 16.022f, 20.6038f, 15.349f, 20.1887f, 14.9339f)
            close()
        }
        }.build()

        return _userPen!!
    }

private var _userPen: ImageVector? = null
