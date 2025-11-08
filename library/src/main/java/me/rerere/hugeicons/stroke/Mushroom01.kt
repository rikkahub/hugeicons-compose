package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mushroom01: ImageVector
    get() {
        if (_mushroom01 != null) {
            return _mushroom01!!
        }
        _mushroom01 = ImageVector.Builder(
            name = "Mushroom01",
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
        moveTo(17f, 15f)
        curveTo(19.412f, 14.6082f, 21f, 13.9411f, 21f, 13.1839f)
        curveTo(21f, 11.9778f, 16.9706f, 11f, 12f, 11f)
        curveTo(7.02944f, 11f, 3f, 11.9778f, 3f, 13.1839f)
        curveTo(3f, 13.9411f, 4.58803f, 14.6082f, 7f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 13f)
        curveTo(21f, 6.92487f, 16.9706f, 2f, 12f, 2f)
        curveTo(7.02944f, 2f, 3f, 6.92487f, 3f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 4.76514f)
        curveTo(17.5348f, 5.50377f, 16.671f, 6f, 15.6823f, 6f)
        curveTo(14.2009f, 6f, 13f, 4.88603f, 13f, 3.51187f)
        curveTo(13f, 2.94318f, 13.2057f, 2.41905f, 13.5518f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 11.5f)
        curveTo(9.99527f, 14.9495f, 9.90043f, 20.1752f, 8f, 22f)
        moveTo(14f, 11.5f)
        curveTo(14.0047f, 14.9495f, 14.0996f, 20.1752f, 16f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.00781f, 7f)
        lineTo(8.99883f, 7f)
        }
        }.build()

        return _mushroom01!!
    }

private var _mushroom01: ImageVector? = null
