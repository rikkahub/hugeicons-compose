package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Customize: ImageVector
    get() {
        if (_customize != null) {
            return _customize!!
        }
        _customize = ImageVector.Builder(
            name = "Customize",
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
        moveTo(21f, 17.5f)
        curveTo(21f, 19.433f, 19.433f, 21f, 17.5f, 21f)
        curveTo(15.567f, 21f, 14f, 19.433f, 14f, 17.5f)
        curveTo(14f, 15.567f, 15.567f, 14f, 17.5f, 14f)
        curveTo(19.433f, 14f, 21f, 15.567f, 21f, 17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 14f)
        horizontalLineTo(6.5f)
        curveTo(4.567f, 14f, 3f, 15.567f, 3f, 17.5f)
        curveTo(3f, 19.433f, 4.567f, 21f, 6.5f, 21f)
        horizontalLineTo(17.5f)
        curveTo(19.433f, 21f, 21f, 19.433f, 21f, 17.5f)
        curveTo(21f, 15.567f, 19.433f, 14f, 17.5f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 6.5f)
        curveTo(3f, 8.433f, 4.567f, 10f, 6.5f, 10f)
        curveTo(8.433f, 10f, 10f, 8.433f, 10f, 6.5f)
        curveTo(10f, 4.567f, 8.433f, 3f, 6.5f, 3f)
        curveTo(4.567f, 3f, 3f, 4.567f, 3f, 6.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 3f)
        horizontalLineTo(17.5f)
        curveTo(19.433f, 3f, 21f, 4.567f, 21f, 6.5f)
        curveTo(21f, 8.433f, 19.433f, 10f, 17.5f, 10f)
        horizontalLineTo(6.5f)
        curveTo(4.567f, 10f, 3f, 8.433f, 3f, 6.5f)
        curveTo(3f, 4.567f, 4.567f, 3f, 6.5f, 3f)
        }
        }.build()

        return _customize!!
    }

private var _customize: ImageVector? = null
