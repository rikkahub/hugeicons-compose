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

val HugeIcons.BookLock: ImageVector
    get() {
        if (_bookLock != null) {
            return _bookLock!!
        }
        _bookLock = ImageVector.Builder(
            name = "BookLock",
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
            moveTo(19.5f, 22f)
            horizontalLineTo(5.5f)
            curveTo(4.39543f, 22f, 3.5f, 21.1046f, 3.5f, 20f)
            moveTo(3.5f, 20f)
            curveTo(3.5f, 18.8954f, 4.39543f, 18f, 5.5f, 18f)
            horizontalLineTo(19.5f)
            verticalLineTo(14f)
            moveTo(3.5f, 20f)
            verticalLineTo(8f)
            curveTo(3.5f, 5.17157f, 3.5f, 3.75736f, 4.37868f, 2.87868f)
            curveTo(5.25736f, 2f, 6.67157f, 2f, 9.5f, 2f)
            horizontalLineTo(11.5f)
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
            moveTo(19f, 18f)
            curveTo(19f, 18f, 18f, 18.7628f, 18f, 20f)
            curveTo(18f, 21.2372f, 19f, 22f, 19f, 22f)
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
            moveTo(19f, 5.5f)
            verticalLineTo(4f)
            curveTo(19f, 2.89543f, 18.1046f, 2f, 17f, 2f)
            curveTo(15.8954f, 2f, 15f, 2.89543f, 15f, 4f)
            verticalLineTo(5.5f)
            moveTo(19f, 5.5f)
            horizontalLineTo(15f)
            moveTo(19f, 5.5f)
            curveTo(19.8284f, 5.5f, 20.5f, 6.17157f, 20.5f, 7f)
            verticalLineTo(7.75f)
            curveTo(20.5f, 8.44891f, 20.5f, 8.79837f, 20.3858f, 9.07403f)
            curveTo(20.2336f, 9.44157f, 19.9416f, 9.73358f, 19.574f, 9.88582f)
            curveTo(19.2984f, 10f, 18.9489f, 10f, 18.25f, 10f)
            horizontalLineTo(15.75f)
            curveTo(15.0511f, 10f, 14.7016f, 10f, 14.426f, 9.88582f)
            curveTo(14.0584f, 9.73358f, 13.7664f, 9.44157f, 13.6142f, 9.07403f)
            curveTo(13.5f, 8.79837f, 13.5f, 8.44891f, 13.5f, 7.75f)
            verticalLineTo(7f)
            curveTo(13.5f, 6.17157f, 14.1716f, 5.5f, 15f, 5.5f)
        }
        }.build()

        return _bookLock!!
    }

private var _bookLock: ImageVector? = null
