package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MayanPyramid: ImageVector
    get() {
        if (_mayanPyramid != null) {
            return _mayanPyramid!!
        }
        _mayanPyramid = ImageVector.Builder(
            name = "MayanPyramid",
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
        moveTo(8.5f, 17f)
        horizontalLineTo(4f)
        curveTo(2.34533f, 17f, 2f, 17.3453f, 2f, 19f)
        verticalLineTo(20f)
        curveTo(2f, 21.6547f, 2.34533f, 22f, 4f, 22f)
        horizontalLineTo(20f)
        curveTo(21.6547f, 22f, 22f, 21.6547f, 22f, 20f)
        verticalLineTo(19f)
        curveTo(22f, 17.3453f, 21.6547f, 17f, 20f, 17f)
        horizontalLineTo(15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 12f)
        horizontalLineTo(6f)
        curveTo(4.34533f, 12f, 4f, 12.3453f, 4f, 14f)
        verticalLineTo(17f)
        moveTo(15f, 12f)
        horizontalLineTo(18f)
        curveTo(19.6547f, 12f, 20f, 12.3453f, 20f, 14f)
        verticalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 12f)
        verticalLineTo(9f)
        curveTo(6f, 7.34533f, 6.34533f, 7f, 8f, 7f)
        horizontalLineTo(16f)
        curveTo(17.6547f, 7f, 18f, 7.34533f, 18f, 9f)
        verticalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 7f)
        verticalLineTo(4f)
        curveTo(9f, 2.34533f, 9.34533f, 2f, 11f, 2f)
        horizontalLineTo(13f)
        curveTo(14.6547f, 2f, 15f, 2.34533f, 15f, 4f)
        verticalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 7f)
        lineTo(16f, 22f)
        moveTo(10.5f, 7f)
        lineTo(8f, 22f)
        }
        }.build()

        return _mayanPyramid!!
    }

private var _mayanPyramid: ImageVector? = null
