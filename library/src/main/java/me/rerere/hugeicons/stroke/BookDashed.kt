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

val HugeIcons.BookDashed: ImageVector
    get() {
        if (_bookDashed != null) {
            return _bookDashed!!
        }
        _bookDashed = ImageVector.Builder(
            name = "BookDashed",
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
            moveTo(20f, 22f)
            horizontalLineTo(17f)
            moveTo(4f, 20f)
            curveTo(4f, 18.8954f, 4.89543f, 18f, 6f, 18f)
            horizontalLineTo(7f)
            moveTo(4f, 20f)
            curveTo(4f, 21.1046f, 4.89543f, 22f, 6f, 22f)
            horizontalLineTo(7f)
            moveTo(4f, 20f)
            verticalLineTo(15f)
            moveTo(17f, 2.00435f)
            curveTo(18.2398f, 2.02228f, 18.9427f, 2.11424f, 19.4142f, 2.58579f)
            curveTo(19.8858f, 3.05733f, 19.9777f, 3.76022f, 19.9957f, 5f)
            moveTo(4.07612f, 5f)
            curveTo(4.17203f, 4.02491f, 4.38879f, 3.36857f, 4.87868f, 2.87868f)
            curveTo(5.36857f, 2.38879f, 6.02491f, 2.17203f, 7f, 2.07612f)
            moveTo(11f, 2f)
            horizontalLineTo(13f)
            moveTo(20f, 9f)
            verticalLineTo(11f)
            moveTo(4f, 9f)
            verticalLineTo(11f)
            moveTo(20f, 15f)
            verticalLineTo(18f)
            horizontalLineTo(17f)
            moveTo(13f, 22f)
            horizontalLineTo(11f)
            moveTo(13f, 18f)
            horizontalLineTo(11f)
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
            moveTo(19.5f, 18f)
            curveTo(19.5f, 18f, 18.5f, 18.7628f, 18.5f, 20f)
            curveTo(18.5f, 21.2372f, 19.5f, 22f, 19.5f, 22f)
        }
        }.build()

        return _bookDashed!!
    }

private var _bookDashed: ImageVector? = null
