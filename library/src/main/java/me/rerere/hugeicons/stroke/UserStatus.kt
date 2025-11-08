package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserStatus: ImageVector
    get() {
        if (_userStatus != null) {
            return _userStatus!!
        }
        _userStatus = ImageVector.Builder(
            name = "UserStatus",
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
        moveTo(15f, 9f)
        curveTo(15f, 7.34315f, 13.6569f, 6f, 12f, 6f)
        curveTo(10.3431f, 6f, 9f, 7.34315f, 9f, 9f)
        curveTo(9f, 10.6569f, 10.3431f, 12f, 12f, 12f)
        curveTo(13.6569f, 12f, 15f, 10.6569f, 15f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 19f)
        curveTo(22f, 17.3431f, 20.6569f, 16f, 19f, 16f)
        curveTo(17.3431f, 16f, 16f, 17.3431f, 16f, 19f)
        curveTo(16f, 20.6569f, 17.3431f, 22f, 19f, 22f)
        curveTo(20.6569f, 22f, 22f, 20.6569f, 22f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.8526f, 13.7202f)
        curveTo(21.9495f, 13.1613f, 22f, 12.5866f, 22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        curveTo(12.5866f, 22f, 13.1613f, 21.9495f, 13.7202f, 21.8526f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 17f)
        curveTo(7f, 14.2386f, 9.23858f, 12f, 12f, 12f)
        curveTo(13.5743f, 12f, 14.9786f, 12.7276f, 15.8951f, 13.8648f)
        }
        }.build()

        return _userStatus!!
    }

private var _userStatus: ImageVector? = null
