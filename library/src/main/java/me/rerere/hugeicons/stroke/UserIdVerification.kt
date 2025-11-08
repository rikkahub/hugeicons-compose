package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
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
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 21.5001f)
        curveTo(16.3945f, 21.5001f, 17.0918f, 21.5001f, 17.6672f, 21.362f)
        curveTo(19.4955f, 20.923f, 20.9229f, 19.4956f, 21.3618f, 17.6673f)
        curveTo(21.5f, 17.0919f, 21.5f, 16.3946f, 21.5f, 15.0001f)
        moveTo(9f, 21.5001f)
        curveTo(7.60547f, 21.5001f, 6.90821f, 21.5001f, 6.33277f, 21.362f)
        curveTo(4.50453f, 20.923f, 3.07707f, 19.4956f, 2.63815f, 17.6673f)
        curveTo(2.5f, 17.0919f, 2.5f, 16.3946f, 2.5f, 15.0001f)
        moveTo(9f, 2.50012f)
        curveTo(7.60547f, 2.50012f, 6.90821f, 2.50012f, 6.33277f, 2.63827f)
        curveTo(4.50453f, 3.0772f, 3.07707f, 4.50465f, 2.63815f, 6.3329f)
        curveTo(2.5f, 6.90833f, 2.5f, 7.6056f, 2.5f, 9.00012f)
        moveTo(15f, 2.50012f)
        curveTo(16.3945f, 2.50012f, 17.0918f, 2.50012f, 17.6672f, 2.63827f)
        curveTo(19.4955f, 3.0772f, 20.9229f, 4.50465f, 21.3618f, 6.3329f)
        curveTo(21.5f, 6.90833f, 21.5f, 7.6056f, 21.5f, 9.00012f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 9.5f)
        curveTo(15f, 7.84315f, 13.6569f, 6.5f, 12f, 6.5f)
        curveTo(10.3431f, 6.5f, 9f, 7.84315f, 9f, 9.5f)
        curveTo(9f, 11.1569f, 10.3431f, 12.5f, 12f, 12.5f)
        curveTo(13.6569f, 12.5f, 15f, 11.1569f, 15f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 17.5f)
        curveTo(17f, 14.7386f, 14.7614f, 12.5f, 12f, 12.5f)
        curveTo(9.23858f, 12.5f, 7f, 14.7386f, 7f, 17.5f)
        }
        }.build()

        return _userIdVerification!!
    }

private var _userIdVerification: ImageVector? = null
