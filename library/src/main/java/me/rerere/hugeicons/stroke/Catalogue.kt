package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Catalogue: ImageVector
    get() {
        if (_catalogue != null) {
            return _catalogue!!
        }
        _catalogue = ImageVector.Builder(
            name = "Catalogue",
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
        moveTo(14.5f, 17.5f)
        verticalLineTo(7.5f)
        horizontalLineTo(7.5001f)
        curveTo(5.1431f, 7.5f, 3.9646f, 7.5f, 3.23237f, 8.23222f)
        curveTo(2.50013f, 8.96445f, 2.50012f, 10.1429f, 2.5001f, 12.5f)
        lineTo(2.50006f, 16.5f)
        curveTo(2.50004f, 18.857f, 2.50003f, 20.0355f, 3.23226f, 20.7678f)
        curveTo(3.9645f, 21.5f, 5.14302f, 21.5f, 7.50006f, 21.5f)
        horizontalLineTo(10.5f)
        curveTo(12.3856f, 21.5f, 13.3284f, 21.5f, 13.9142f, 20.9142f)
        curveTo(14.5f, 20.3284f, 14.5f, 19.3856f, 14.5f, 17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.4999f, 16.5f)
        horizontalLineTo(16.4999f)
        curveTo(18.8569f, 16.5f, 20.0355f, 16.5f, 20.7677f, 15.7678f)
        curveTo(21.4999f, 15.0355f, 21.4999f, 13.857f, 21.4999f, 11.5f)
        verticalLineTo(7.5f)
        curveTo(21.4999f, 5.14298f, 21.4999f, 3.96447f, 20.7677f, 3.23223f)
        curveTo(20.0355f, 2.5f, 18.8569f, 2.5f, 16.4999f, 2.5f)
        horizontalLineTo(9.50006f)
        lineTo(9.5002f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.50006f, 12.5f)
        horizontalLineTo(9.00006f)
        moveTo(5.50006f, 16.5f)
        horizontalLineTo(11.5001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.50006f, 2.5f)
        lineTo(14.5001f, 7.5f)
        }
        }.build()

        return _catalogue!!
    }

private var _catalogue: ImageVector? = null
