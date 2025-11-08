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
        moveTo(11f, 10f)
        curveTo(11f, 8.89543f, 10.1046f, 8f, 9f, 8f)
        curveTo(7.89543f, 8f, 7f, 8.89543f, 7f, 10f)
        curveTo(7f, 11.1046f, 7.89543f, 12f, 9f, 12f)
        curveTo(10.1046f, 12f, 11f, 11.1046f, 11f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 16f)
        curveTo(13f, 13.7909f, 11.2091f, 12f, 9f, 12f)
        curveTo(6.79086f, 12f, 5f, 13.7909f, 5f, 16f)
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
