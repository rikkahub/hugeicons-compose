package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BabyBed02: ImageVector
    get() {
        if (_babyBed02 != null) {
            return _babyBed02!!
        }
        _babyBed02 = ImageVector.Builder(
            name = "BabyBed02",
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
        moveTo(12f, 7f)
        lineTo(12f, 15f)
        moveTo(16f, 7f)
        lineTo(16f, 15f)
        moveTo(8f, 7f)
        lineTo(8f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 17f)
        curveTo(19.3349f, 18.8671f, 15.8341f, 20f, 12f, 20f)
        curveTo(8.16586f, 20f, 4.66508f, 18.8671f, 2f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 18f)
        verticalLineTo(6f)
        curveTo(20f, 4.89543f, 20.8954f, 4f, 22f, 4f)
        moveTo(4f, 18f)
        verticalLineTo(6f)
        curveTo(4f, 4.89543f, 3.10457f, 4f, 2f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 7f)
        horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 15f)
        horizontalLineTo(20f)
        }
        }.build()

        return _babyBed02!!
    }

private var _babyBed02: ImageVector? = null
