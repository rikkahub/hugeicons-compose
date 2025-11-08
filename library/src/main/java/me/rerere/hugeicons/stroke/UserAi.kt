package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserAi: ImageVector
    get() {
        if (_userAi != null) {
            return _userAi!!
        }
        _userAi = ImageVector.Builder(
            name = "UserAi",
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
        moveTo(15f, 2.4578f)
        curveTo(14.053f, 2.16035f, 13.0452f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 10.9548f, 21.8396f, 9.94704f, 21.5422f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 10f)
        curveTo(15f, 11.6569f, 13.6569f, 13f, 12f, 13f)
        curveTo(10.3431f, 13f, 9f, 11.6569f, 9f, 10f)
        curveTo(9f, 8.34315f, 10.3431f, 7f, 12f, 7f)
        curveTo(13.6569f, 7f, 15f, 8.34315f, 15f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.49994f, 19.5001f)
        lineTo(6.06034f, 18.5194f)
        curveTo(6.95055f, 16.9616f, 8.60727f, 16.0001f, 10.4016f, 16.0001f)
        horizontalLineTo(13.5983f)
        curveTo(15.3926f, 16.0001f, 17.0493f, 16.9616f, 17.9395f, 18.5194f)
        lineTo(18.4999f, 19.5001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.9737f, 2.02148f)
        curveTo(18.9795f, 1.99284f, 19.0205f, 1.99284f, 19.0263f, 2.02148f)
        curveTo(19.3302f, 3.50808f, 20.4919f, 4.66984f, 21.9785f, 4.97368f)
        curveTo(22.0072f, 4.97954f, 22.0072f, 5.02046f, 21.9785f, 5.02632f)
        curveTo(20.4919f, 5.33016f, 19.3302f, 6.49192f, 19.0263f, 7.97852f)
        curveTo(19.0205f, 8.00716f, 18.9795f, 8.00716f, 18.9737f, 7.97852f)
        curveTo(18.6698f, 6.49192f, 17.5081f, 5.33016f, 16.0215f, 5.02632f)
        curveTo(15.9928f, 5.02046f, 15.9928f, 4.97954f, 16.0215f, 4.97368f)
        curveTo(17.5081f, 4.66984f, 18.6698f, 3.50808f, 18.9737f, 2.02148f)
        }
        }.build()

        return _userAi!!
    }

private var _userAi: ImageVector? = null
