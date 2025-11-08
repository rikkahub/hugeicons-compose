package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserLove01: ImageVector
    get() {
        if (_userLove01 != null) {
            return _userLove01!!
        }
        _userLove01 = ImageVector.Builder(
            name = "UserLove01",
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
        moveTo(14.5f, 7.5f)
        curveTo(14.5f, 4.73858f, 12.2614f, 2.5f, 9.5f, 2.5f)
        curveTo(6.73858f, 2.5f, 4.5f, 4.73858f, 4.5f, 7.5f)
        curveTo(4.5f, 10.2614f, 6.73858f, 12.5f, 9.5f, 12.5f)
        curveTo(12.2614f, 12.5f, 14.5f, 10.2614f, 14.5f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 19.5f)
        curveTo(2.5f, 15.634f, 5.63401f, 12.5f, 9.5f, 12.5f)
        curveTo(10.5736f, 12.5f, 11.5907f, 12.7417f, 12.5f, 13.1736f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 21.5f)
        curveTo(17.5f, 21.5f, 21.5f, 19.6471f, 21.5f, 16.6389f)
        curveTo(21.5f, 15.4576f, 20.6579f, 14.5f, 19.5f, 14.5f)
        curveTo(18.5526f, 14.5f, 17.9211f, 14.9118f, 17.5f, 15.7353f)
        curveTo(17.0789f, 14.9118f, 16.4474f, 14.5f, 15.5f, 14.5f)
        curveTo(14.3421f, 14.5f, 13.5f, 15.4576f, 13.5f, 16.6389f)
        curveTo(13.5f, 19.6471f, 17.5f, 21.5f, 17.5f, 21.5f)
        }
        }.build()

        return _userLove01!!
    }

private var _userLove01: ImageVector? = null
