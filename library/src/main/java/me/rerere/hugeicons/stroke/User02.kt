package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.User02: ImageVector
    get() {
        if (_user02 != null) {
            return _user02!!
        }
        _user02 = ImageVector.Builder(
            name = "User02",
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
        moveTo(18.5f, 20f)
        verticalLineTo(17.9704f)
        curveTo(18.5f, 16.7281f, 17.9407f, 15.5099f, 16.8103f, 14.9946f)
        curveTo(15.4315f, 14.3661f, 13.7779f, 14f, 12f, 14f)
        curveTo(10.2221f, 14f, 8.5685f, 14.3661f, 7.18968f, 14.9946f)
        curveTo(6.05927f, 15.5099f, 5.5f, 16.7281f, 5.5f, 17.9704f)
        verticalLineTo(20f)
        }
        }.build()

        return _user02!!
    }

private var _user02: ImageVector? = null
