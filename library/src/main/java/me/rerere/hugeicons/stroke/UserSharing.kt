package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
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
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 11f)
        curveTo(16f, 8.79086f, 14.2091f, 7f, 12f, 7f)
        curveTo(9.79086f, 7f, 8f, 8.79086f, 8f, 11f)
        curveTo(8f, 13.2091f, 9.79086f, 15f, 12f, 15f)
        curveTo(14.2091f, 15f, 16f, 13.2091f, 16f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.07026f, 15f)
        curveTo(4.38958f, 13.8233f, 4f, 12.4571f, 4f, 11f)
        curveTo(4f, 6.58172f, 7.58172f, 3f, 12f, 3f)
        curveTo(16.4183f, 3f, 20f, 6.58172f, 20f, 11f)
        curveTo(20f, 12.4571f, 19.6104f, 13.8233f, 18.9297f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 21f)
        curveTo(18f, 17.6863f, 15.3137f, 15f, 12f, 15f)
        curveTo(8.68629f, 15f, 6f, 17.6863f, 6f, 21f)
        }
        }.build()

        return _userSharing!!
    }

private var _userSharing: ImageVector? = null
