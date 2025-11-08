package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserFullView: ImageVector
    get() {
        if (_userFullView != null) {
            return _userFullView!!
        }
        _userFullView = ImageVector.Builder(
            name = "UserFullView",
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
        moveTo(15f, 5f)
        curveTo(15f, 6.65685f, 13.2418f, 8.5f, 12f, 8.5f)
        curveTo(10.7582f, 8.5f, 9f, 6.65685f, 9f, 5f)
        curveTo(9f, 3.34315f, 10.3431f, 2f, 12f, 2f)
        curveTo(13.6569f, 2f, 15f, 3.34315f, 15f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.0415f, 9f)
        curveTo(17.5645f, 10.3353f, 18.5514f, 12.5969f, 17.6652f, 14.7052f)
        curveTo(17.4742f, 15.1594f, 17.0361f, 15.4539f, 16.5514f, 15.4539f)
        curveTo(16.0585f, 15.4539f, 15.249f, 15.296f, 15.0917f, 15.9374f)
        lineTo(13.9945f, 20.4123f)
        curveTo(13.7657f, 21.3454f, 12.9434f, 22f, 12.0001f, 22f)
        curveTo(11.0567f, 22f, 10.2344f, 21.3454f, 10.0056f, 20.4123f)
        lineTo(8.90839f, 15.9374f)
        curveTo(8.7511f, 15.296f, 7.94155f, 15.4539f, 7.44868f, 15.4539f)
        curveTo(6.96396f, 15.4539f, 6.52588f, 15.1594f, 6.33494f, 14.7052f)
        curveTo(5.44873f, 12.5969f, 6.43564f, 10.3353f, 7.95863f, 9f)
        }
        }.build()

        return _userFullView!!
    }

private var _userFullView: ImageVector? = null
