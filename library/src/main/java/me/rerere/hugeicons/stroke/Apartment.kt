package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Apartment: ImageVector
    get() {
        if (_apartment != null) {
            return _apartment!!
        }
        _apartment = ImageVector.Builder(
            name = "Apartment",
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
        moveTo(9.5f, 2.5f)
        horizontalLineTo(6.5f)
        curveTo(4.61438f, 2.5f, 3.67157f, 2.5f, 3.08579f, 3.08579f)
        curveTo(2.5f, 3.67157f, 2.5f, 4.61438f, 2.5f, 6.5f)
        verticalLineTo(17.5f)
        curveTo(2.5f, 19.3856f, 2.5f, 20.3284f, 3.08579f, 20.9142f)
        curveTo(3.67157f, 21.5f, 4.61438f, 21.5f, 6.5f, 21.5f)
        horizontalLineTo(13.5f)
        verticalLineTo(6.5f)
        curveTo(13.5f, 4.61438f, 13.5f, 3.67157f, 12.9142f, 3.08579f)
        curveTo(12.3284f, 2.5f, 11.3856f, 2.5f, 9.5f, 2.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 5.5f)
        horizontalLineTo(6.5f)
        moveTo(9.5f, 5.5f)
        horizontalLineTo(10.5f)
        moveTo(5.5f, 8.5f)
        horizontalLineTo(6.5f)
        moveTo(9.5f, 8.5f)
        horizontalLineTo(10.5f)
        moveTo(5.5f, 11.5f)
        horizontalLineTo(6.5f)
        moveTo(9.5f, 11.5f)
        horizontalLineTo(10.5f)
        moveTo(5.5f, 14.5f)
        horizontalLineTo(6.5f)
        moveTo(9.5f, 14.5f)
        horizontalLineTo(10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 21.5f)
        verticalLineTo(18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 7.5f)
        horizontalLineTo(13.5f)
        verticalLineTo(21.5f)
        horizontalLineTo(17.5f)
        curveTo(19.3856f, 21.5f, 20.3284f, 21.5f, 20.9142f, 20.9142f)
        curveTo(21.5f, 20.3284f, 21.5f, 19.3856f, 21.5f, 17.5f)
        verticalLineTo(11.5f)
        curveTo(21.5f, 9.61438f, 21.5f, 8.67157f, 20.9142f, 8.08579f)
        curveTo(20.3284f, 7.5f, 19.3856f, 7.5f, 17.5f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 10.5f)
        horizontalLineTo(18f)
        moveTo(17f, 13.5f)
        horizontalLineTo(18f)
        moveTo(17f, 16.5f)
        horizontalLineTo(18f)
        }
        }.build()

        return _apartment!!
    }

private var _apartment: ImageVector? = null
