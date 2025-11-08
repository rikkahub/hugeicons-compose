package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Re: ImageVector
    get() {
        if (_re != null) {
            return _re!!
        }
        _re = ImageVector.Builder(
            name = "Re",
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
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.4924f, 14f)
        horizontalLineTo(18.5014f)
        moveTo(18.4922f, 17.5f)
        horizontalLineTo(18.5012f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 14.5f)
        curveTo(7f, 14.5f, 8.5f, 12.5f, 10f, 14f)
        moveTo(7f, 14.5f)
        verticalLineTo(18f)
        moveTo(7f, 14.5f)
        verticalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 15.5f)
        verticalLineTo(14.75f)
        curveTo(12f, 13.7835f, 12.7835f, 13f, 13.75f, 13f)
        curveTo(14.7165f, 13f, 15.5f, 13.7835f, 15.5f, 14.75f)
        verticalLineTo(15.5f)
        horizontalLineTo(12f)
        moveTo(12f, 15.5f)
        verticalLineTo(16.25f)
        curveTo(12f, 17.2165f, 12.7835f, 18f, 13.75f, 18f)
        curveTo(14.2397f, 18f, 14.6824f, 17.7989f, 15f, 17.4747f)
        }
        }.build()

        return _re!!
    }

private var _re: ImageVector? = null
