package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserSquare: ImageVector
    get() {
        if (_userSquare != null) {
            return _userSquare!!
        }
        _userSquare = ImageVector.Builder(
            name = "UserSquare",
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
        moveTo(15f, 10f)
        curveTo(15f, 8.34315f, 13.6569f, 7f, 12f, 7f)
        curveTo(10.3431f, 7f, 9f, 8.34315f, 9f, 10f)
        curveTo(9f, 11.6569f, 10.3431f, 13f, 12f, 13f)
        curveTo(13.6569f, 13f, 15f, 11.6569f, 15f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 18f)
        curveTo(17f, 15.2386f, 14.7614f, 13f, 12f, 13f)
        curveTo(9.23858f, 13f, 7f, 15.2386f, 7f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 13f)
        verticalLineTo(11f)
        curveTo(21f, 7.22876f, 21f, 5.34315f, 19.8284f, 4.17157f)
        curveTo(18.6569f, 3f, 16.7712f, 3f, 13f, 3f)
        horizontalLineTo(11f)
        curveTo(7.22876f, 3f, 5.34315f, 3f, 4.17157f, 4.17157f)
        curveTo(3f, 5.34315f, 3f, 7.22876f, 3f, 11f)
        verticalLineTo(13f)
        curveTo(3f, 16.7712f, 3f, 18.6569f, 4.17157f, 19.8284f)
        curveTo(5.34315f, 21f, 7.22876f, 21f, 11f, 21f)
        horizontalLineTo(13f)
        curveTo(16.7712f, 21f, 18.6569f, 21f, 19.8284f, 19.8284f)
        curveTo(21f, 18.6569f, 21f, 16.7712f, 21f, 13f)
        }
        }.build()

        return _userSquare!!
    }

private var _userSquare: ImageVector? = null
