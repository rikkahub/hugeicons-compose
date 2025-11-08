package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserStory: ImageVector
    get() {
        if (_userStory != null) {
            return _userStory!!
        }
        _userStory = ImageVector.Builder(
            name = "UserStory",
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
        moveTo(12f, 2f)
        curveTo(17.5237f, 2f, 22f, 6.47778f, 22f, 12f)
        curveTo(22f, 17.5222f, 17.5237f, 22f, 12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 21.5f)
        curveTo(7.81163f, 21.0953f, 6.69532f, 20.5107f, 5.72302f, 19.7462f)
        moveTo(5.72302f, 4.25385f)
        curveTo(6.69532f, 3.50059f, 7.81163f, 2.90473f, 9f, 2.5f)
        moveTo(2f, 10.2461f)
        curveTo(2.21607f, 9.08813f, 2.66019f, 7.96386f, 3.29638f, 6.94078f)
        moveTo(2f, 13.7539f)
        curveTo(2.21607f, 14.9119f, 2.66019f, 16.0361f, 3.29638f, 17.0592f)
        }

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
        moveTo(17f, 17f)
        curveTo(17f, 14.2386f, 14.7614f, 12f, 12f, 12f)
        curveTo(9.23858f, 12f, 7f, 14.2386f, 7f, 17f)
        }
        }.build()

        return _userStory!!
    }

private var _userStory: ImageVector? = null
