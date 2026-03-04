package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserCircle: ImageVector
    get() {
        if (_userCircle != null) {
            return _userCircle!!
        }
        _userCircle = ImageVector.Builder(
            name = "UserCircle",
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
        moveTo(15.5f, 10.5f)
        curveTo(15.5f, 8.567f, 13.933f, 7f, 12f, 7f)
        curveTo(10.067f, 7f, 8.5f, 8.567f, 8.5f, 10.5f)
        curveTo(8.5f, 12.433f, 10.067f, 14f, 12f, 14f)
        curveTo(13.933f, 14f, 15.5f, 12.433f, 15.5f, 10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 20f)
        curveTo(18f, 16.6863f, 15.3137f, 14f, 12f, 14f)
        curveTo(8.68629f, 14f, 6f, 16.6863f, 6f, 20f)
        }
        }.build()

        return _userCircle!!
    }

private var _userCircle: ImageVector? = null
