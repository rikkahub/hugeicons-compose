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

val HugeIcons.UserSharing: ImageVector
    get() {
        if (_userSharing != null) {
            return _userSharing!!
        }
        _userSharing = ImageVector.Builder(
            name = "UserSharing",
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
            moveTo(18.9985f, 21.5005f)
            curveTo(18.7474f, 18.3025f, 16.1363f, 15.7707f, 12.8692f, 15.5573f)
            lineTo(11.9985f, 15.5005f)
            curveTo(11.6875f, 15.5088f, 11.3977f, 15.5199f, 11.1242f, 15.533f)
            curveTo(7.88605f, 15.6885f, 5.24718f, 18.334f, 4.99853f, 21.5005f)
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
            moveTo(15f, 9.5f)
            curveTo(15f, 11.1569f, 13.6569f, 12.5f, 12f, 12.5f)
            curveTo(10.3431f, 12.5f, 9f, 11.1569f, 9f, 9.5f)
            curveTo(9f, 7.84315f, 10.3431f, 6.5f, 12f, 6.5f)
            curveTo(13.6569f, 6.5f, 15f, 7.84315f, 15f, 9.5f)
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
            moveTo(18.9297f, 14.5f)
            curveTo(19.6104f, 13.3233f, 20f, 11.9571f, 20f, 10.5f)
            curveTo(20f, 6.08172f, 16.4183f, 2.5f, 12f, 2.5f)
            curveTo(7.58172f, 2.5f, 4f, 6.08172f, 4f, 10.5f)
            curveTo(4f, 11.9571f, 4.38958f, 13.3233f, 5.07026f, 14.5f)
        }
        }.build()

        return _userSharing!!
    }

private var _userSharing: ImageVector? = null
