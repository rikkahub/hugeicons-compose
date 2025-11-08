package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserWarning01: ImageVector
    get() {
        if (_userWarning01 != null) {
            return _userWarning01!!
        }
        _userWarning01 = ImageVector.Builder(
            name = "UserWarning01",
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
        moveTo(19.5056f, 18.9361f)
        curveTo(21.5518f, 17.0704f, 16.585f, 14.5564f, 16.585f, 14.5564f)
        curveTo(15.5661f, 14.0611f, 14.0378f, 13.5004f, 12f, 13.5f)
        curveTo(9.96224f, 13.5004f, 8.43392f, 14.0617f, 7.41504f, 14.5571f)
        curveTo(7.41504f, 14.5571f, 2.44821f, 17.071f, 4.49439f, 18.9368f)
        curveTo(5.49393f, 19.8482f, 6.60717f, 20.5f, 8.00677f, 20.5f)
        lineTo(15.9932f, 20.4994f)
        curveTo(17.3928f, 20.4994f, 18.5061f, 19.8475f, 19.5056f, 18.9361f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 7f)
        curveTo(15.5f, 8.933f, 13.933f, 10.5f, 12f, 10.5f)
        curveTo(10.067f, 10.5f, 8.5f, 8.933f, 8.5f, 7f)
        curveTo(8.5f, 5.067f, 10.067f, 3.5f, 12f, 3.5f)
        curveTo(13.933f, 3.5f, 15.5f, 5.067f, 15.5f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 5f)
        verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 12f)
        verticalLineTo(12.01f)
        }
        }.build()

        return _userWarning01!!
    }

private var _userWarning01: ImageVector? = null
