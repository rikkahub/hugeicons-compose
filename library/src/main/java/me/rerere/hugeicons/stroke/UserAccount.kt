package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserAccount: ImageVector
    get() {
        if (_userAccount != null) {
            return _userAccount!!
        }
        _userAccount = ImageVector.Builder(
            name = "UserAccount",
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
        moveTo(2f, 12f)
        curveTo(2f, 8.22876f, 2f, 6.34315f, 3.17157f, 5.17157f)
        curveTo(4.34315f, 4f, 6.22876f, 4f, 10f, 4f)
        horizontalLineTo(14f)
        curveTo(17.7712f, 4f, 19.6569f, 4f, 20.8284f, 5.17157f)
        curveTo(22f, 6.34315f, 22f, 8.22876f, 22f, 12f)
        curveTo(22f, 15.7712f, 22f, 17.6569f, 20.8284f, 18.8284f)
        curveTo(19.6569f, 20f, 17.7712f, 20f, 14f, 20f)
        horizontalLineTo(10f)
        curveTo(6.22876f, 20f, 4.34315f, 20f, 3.17157f, 18.8284f)
        curveTo(2f, 17.6569f, 2f, 15.7712f, 2f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 12.5f)
        curveTo(7.61929f, 12.5f, 6.5f, 11.3807f, 6.5f, 10f)
        curveTo(6.5f, 8.61929f, 7.61929f, 7.5f, 9f, 7.5f)
        curveTo(10.3807f, 7.5f, 11.5f, 8.61929f, 11.5f, 10f)
        curveTo(11.5f, 11.3807f, 10.3807f, 12.5f, 9f, 12.5f)
        moveTo(9f, 12.5f)
        curveTo(11.2091f, 12.5f, 13f, 14.2909f, 13f, 16.5f)
        moveTo(9f, 12.5f)
        curveTo(6.79086f, 12.5f, 5f, 14.2909f, 5f, 16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 9f)
        horizontalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 12f)
        horizontalLineTo(19f)
        }
        }.build()

        return _userAccount!!
    }

private var _userAccount: ImageVector? = null
