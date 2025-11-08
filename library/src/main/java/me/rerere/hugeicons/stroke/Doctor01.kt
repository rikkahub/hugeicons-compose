package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Doctor01: ImageVector
    get() {
        if (_doctor01 != null) {
            return _doctor01!!
        }
        _doctor01 = ImageVector.Builder(
            name = "Doctor01",
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
        moveTo(20f, 22f)
        verticalLineTo(19f)
        curveTo(20f, 16.1716f, 20f, 14.7574f, 19.1213f, 13.8787f)
        curveTo(18.2426f, 13f, 16.8284f, 13f, 14f, 13f)
        lineTo(12f, 15f)
        lineTo(10f, 13f)
        curveTo(7.17157f, 13f, 5.75736f, 13f, 4.87868f, 13.8787f)
        curveTo(4f, 14.7574f, 4f, 16.1716f, 4f, 19f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 13f)
        verticalLineTo(18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 13f)
        verticalLineTo(17f)
        moveTo(8.5f, 17f)
        curveTo(9.60457f, 17f, 10.5f, 17.8954f, 10.5f, 19f)
        verticalLineTo(20f)
        moveTo(8.5f, 17f)
        curveTo(7.39543f, 17f, 6.5f, 17.8954f, 6.5f, 19f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 6.5f)
        verticalLineTo(5.5f)
        curveTo(15.5f, 3.567f, 13.933f, 2f, 12f, 2f)
        curveTo(10.067f, 2f, 8.5f, 3.567f, 8.5f, 5.5f)
        verticalLineTo(6.5f)
        curveTo(8.5f, 8.433f, 10.067f, 10f, 12f, 10f)
        curveTo(13.933f, 10f, 15.5f, 8.433f, 15.5f, 6.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.75f, 19.25f)
        curveTo(16.75f, 19.6642f, 16.4142f, 20f, 16f, 20f)
        curveTo(15.5858f, 20f, 15.25f, 19.6642f, 15.25f, 19.25f)
        curveTo(15.25f, 18.8358f, 15.5858f, 18.5f, 16f, 18.5f)
        curveTo(16.4142f, 18.5f, 16.75f, 18.8358f, 16.75f, 19.25f)
        }
        }.build()

        return _doctor01!!
    }

private var _doctor01: ImageVector? = null
