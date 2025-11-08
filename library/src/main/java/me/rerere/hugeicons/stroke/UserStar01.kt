package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserStar01: ImageVector
    get() {
        if (_userStar01 != null) {
            return _userStar01!!
        }
        _userStar01 = ImageVector.Builder(
            name = "UserStar01",
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
        moveTo(15f, 8f)
        curveTo(15f, 5.23858f, 12.7614f, 3f, 10f, 3f)
        curveTo(7.23858f, 3f, 5f, 5.23858f, 5f, 8f)
        curveTo(5f, 10.7614f, 7.23858f, 13f, 10f, 13f)
        curveTo(12.7614f, 13f, 15f, 10.7614f, 15f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 20f)
        curveTo(3f, 16.134f, 6.13401f, 13f, 10f, 13f)
        curveTo(11.275f, 13f, 12.4704f, 13.3409f, 13.5f, 13.9365f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.1047f, 14.5055f)
        lineTo(18.7206f, 15.7475f)
        curveTo(18.8046f, 15.9204f, 19.0286f, 16.0862f, 19.2175f, 16.118f)
        lineTo(20.3339f, 16.305f)
        curveTo(21.0478f, 16.425f, 21.2158f, 16.9472f, 20.7014f, 17.4624f)
        lineTo(19.8335f, 18.3374f)
        curveTo(19.6865f, 18.4856f, 19.606f, 18.7715f, 19.6515f, 18.9761f)
        lineTo(19.9f, 20.0594f)
        curveTo(20.096f, 20.9168f, 19.6445f, 21.2485f, 18.8921f, 20.8004f)
        lineTo(17.8457f, 20.1758f)
        curveTo(17.6567f, 20.0629f, 17.3453f, 20.0629f, 17.1528f, 20.1758f)
        lineTo(16.1064f, 20.8004f)
        curveTo(15.3575f, 21.2485f, 14.9025f, 20.9133f, 15.0985f, 20.0594f)
        lineTo(15.347f, 18.9761f)
        curveTo(15.3925f, 18.7715f, 15.312f, 18.4856f, 15.165f, 18.3374f)
        lineTo(14.2971f, 17.4624f)
        curveTo(13.7861f, 16.9472f, 13.9506f, 16.425f, 14.6646f, 16.305f)
        lineTo(15.7809f, 16.118f)
        curveTo(15.9664f, 16.0862f, 16.1904f, 15.9204f, 16.2744f, 15.7475f)
        lineTo(16.8903f, 14.5055f)
        curveTo(17.2263f, 13.8315f, 17.7722f, 13.8315f, 18.1047f, 14.5055f)
        }
        }.build()

        return _userStar01!!
    }

private var _userStar01: ImageVector? = null
