package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserIdVerification: ImageVector
    get() {
        if (_userIdVerification != null) {
            return _userIdVerification!!
        }
        _userIdVerification = ImageVector.Builder(
            name = "UserIdVerification",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(17f, 17.5002f)
            curveTo(16.8206f, 15.3682f, 14.9555f, 13.6804f, 12.6219f, 13.5381f)
            lineTo(12f, 13.5002f)
            curveTo(11.7779f, 13.5058f, 11.5708f, 13.5132f, 11.3755f, 13.5219f)
            curveTo(9.06249f, 13.6256f, 7.17761f, 15.3892f, 7f, 17.5002f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14.5f, 8.5f)
            arcTo(2.5f, 2.5f, 0f, true, false, 9.5f, 8.5f)
            arcTo(2.5f, 2.5f, 0f, true, false, 14.5f, 8.5f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(16.5f, 21.5f)
            curveTo(17.4293f, 21.5f, 17.894f, 21.5f, 18.2804f, 21.4231f)
            curveTo(19.8671f, 21.1075f, 21.1075f, 19.8671f, 21.4231f, 18.2804f)
            curveTo(21.5f, 17.894f, 21.5f, 17.4293f, 21.5f, 16.5f)
            moveTo(7.5f, 2.5f)
            curveTo(6.57069f, 2.5f, 6.10603f, 2.5f, 5.71964f, 2.57686f)
            curveTo(4.13288f, 2.89249f, 2.89249f, 4.13288f, 2.57686f, 5.71964f)
            curveTo(2.5f, 6.10603f, 2.5f, 6.57069f, 2.5f, 7.5f)
            moveTo(7.5f, 21.5f)
            curveTo(6.57069f, 21.5f, 6.10603f, 21.5f, 5.71964f, 21.4231f)
            curveTo(4.13288f, 21.1075f, 2.89249f, 19.8671f, 2.57686f, 18.2804f)
            curveTo(2.5f, 17.894f, 2.5f, 17.4293f, 2.5f, 16.5f)
            moveTo(16.5f, 2.5f)
            curveTo(17.4293f, 2.5f, 17.894f, 2.5f, 18.2804f, 2.57686f)
            curveTo(19.8671f, 2.89249f, 21.1075f, 4.13288f, 21.4231f, 5.71964f)
            curveTo(21.5f, 6.10603f, 21.5f, 6.57069f, 21.5f, 7.5f)
        }
        }.build()

        return _userIdVerification!!
    }

private var _userIdVerification: ImageVector? = null
