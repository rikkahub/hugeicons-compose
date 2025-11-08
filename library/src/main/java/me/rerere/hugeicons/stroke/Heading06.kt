package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Heading06: ImageVector
    get() {
        if (_heading06 != null) {
            return _heading06!!
        }
        _heading06 = ImageVector.Builder(
            name = "Heading06",
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
        moveTo(3.5f, 5f)
        verticalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 5f)
        verticalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 17f)
        curveTo(16.5f, 18.1046f, 17.3954f, 19f, 18.5f, 19f)
        curveTo(19.6046f, 19f, 20.5f, 18.1046f, 20.5f, 17f)
        curveTo(20.5f, 15.8954f, 19.6046f, 15f, 18.5f, 15f)
        curveTo(17.3954f, 15f, 16.5f, 15.8954f, 16.5f, 17f)
        moveTo(16.5f, 17f)
        verticalLineTo(13f)
        curveTo(16.5f, 11.8954f, 17.3954f, 11f, 18.5f, 11f)
        curveTo(19.6046f, 11f, 20.5f, 11.8954f, 20.5f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.5f, 12f)
        lineTo(13.5f, 12f)
        }
        }.build()

        return _heading06!!
    }

private var _heading06: ImageVector? = null
