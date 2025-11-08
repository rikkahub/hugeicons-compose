package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Brochure: ImageVector
    get() {
        if (_brochure != null) {
            return _brochure!!
        }
        _brochure = ImageVector.Builder(
            name = "Brochure",
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
        moveTo(18.5f, 17f)
        verticalLineTo(7f)
        curveTo(18.5f, 5.11438f, 18.5f, 4.17157f, 17.9142f, 3.58579f)
        curveTo(17.3284f, 3f, 16.3856f, 3f, 14.5f, 3f)
        horizontalLineTo(9.5f)
        curveTo(7.61438f, 3f, 6.67157f, 3f, 6.08579f, 3.58579f)
        curveTo(5.5f, 4.17157f, 5.5f, 5.11438f, 5.5f, 7f)
        verticalLineTo(17f)
        curveTo(5.5f, 18.8856f, 5.5f, 19.8284f, 6.08579f, 20.4142f)
        curveTo(6.67157f, 21f, 7.61438f, 21f, 9.5f, 21f)
        horizontalLineTo(14.5f)
        curveTo(16.3856f, 21f, 17.3284f, 21f, 17.9142f, 20.4142f)
        curveTo(18.5f, 19.8284f, 18.5f, 18.8856f, 18.5f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 6f)
        horizontalLineTo(19f)
        curveTo(20.4142f, 6f, 21.1213f, 6f, 21.5607f, 6.43934f)
        curveTo(22f, 6.87868f, 22f, 7.58579f, 22f, 9f)
        verticalLineTo(16f)
        curveTo(22f, 17.4142f, 22f, 18.1213f, 21.5607f, 18.5607f)
        curveTo(21.1213f, 19f, 20.4142f, 19f, 19f, 19f)
        horizontalLineTo(18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 6f)
        horizontalLineTo(5f)
        curveTo(3.58579f, 6f, 2.87868f, 6f, 2.43934f, 6.43934f)
        curveTo(2f, 6.87868f, 2f, 7.58579f, 2f, 9f)
        verticalLineTo(16f)
        curveTo(2f, 17.4142f, 2f, 18.1213f, 2.43934f, 18.5607f)
        curveTo(2.87868f, 19f, 3.58579f, 19f, 5f, 19f)
        horizontalLineTo(5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 8f)
        lineTo(9.5f, 8f)
        moveTo(14.5f, 12f)
        lineTo(9.5f, 12f)
        moveTo(14.5f, 16f)
        horizontalLineTo(9.5f)
        }
        }.build()

        return _brochure!!
    }

private var _brochure: ImageVector? = null
