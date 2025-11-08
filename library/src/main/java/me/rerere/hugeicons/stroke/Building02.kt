package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Building02: ImageVector
    get() {
        if (_building02 != null) {
            return _building02!!
        }
        _building02 = ImageVector.Builder(
            name = "Building02",
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
        moveTo(15f, 2f)
        horizontalLineTo(9f)
        curveTo(5.69067f, 2f, 5f, 2.69067f, 5f, 6f)
        verticalLineTo(22f)
        horizontalLineTo(19f)
        verticalLineTo(6f)
        curveTo(19f, 2.69067f, 18.3093f, 2f, 15f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 22f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 22f)
        verticalLineTo(19f)
        curveTo(15f, 17.3453f, 14.6547f, 17f, 13f, 17f)
        horizontalLineTo(11f)
        curveTo(9.34533f, 17f, 9f, 17.3453f, 9f, 19f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 6f)
        horizontalLineTo(10.5f)
        moveTo(13.5f, 9.5f)
        horizontalLineTo(10.5f)
        moveTo(13.5f, 13f)
        horizontalLineTo(10.5f)
        }
        }.build()

        return _building02!!
    }

private var _building02: ImageVector? = null
