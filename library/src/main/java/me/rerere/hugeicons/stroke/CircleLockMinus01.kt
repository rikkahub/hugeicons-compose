package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleLockMinus01: ImageVector
    get() {
        if (_circleLockMinus01 != null) {
            return _circleLockMinus01!!
        }
        _circleLockMinus01 = ImageVector.Builder(
            name = "CircleLockMinus01",
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
        moveTo(11f, 22f)
        curveTo(7.06358f, 22.0975f, 4f, 18.8075f, 4f, 15f)
        curveTo(4f, 11.134f, 7.11877f, 8f, 10.966f, 8f)
        curveTo(13.5444f, 8f, 15.7956f, 9.4077f, 17f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 9.5f)
        verticalLineTo(6.5f)
        curveTo(15.5f, 4.01472f, 13.4853f, 2f, 11f, 2f)
        curveTo(8.51472f, 2f, 6.5f, 4.01472f, 6.5f, 6.5f)
        verticalLineTo(9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 17f)
        horizontalLineTo(20f)
        }
        }.build()

        return _circleLockMinus01!!
    }

private var _circleLockMinus01: ImageVector? = null
