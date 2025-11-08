package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ComputerDesk01: ImageVector
    get() {
        if (_computerDesk01 != null) {
            return _computerDesk01!!
        }
        _computerDesk01 = ImageVector.Builder(
            name = "ComputerDesk01",
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
        moveTo(22f, 12f)
        horizontalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 17f)
        horizontalLineTo(16f)
        curveTo(14.1144f, 17f, 13.1716f, 17f, 12.5858f, 16.4142f)
        curveTo(12f, 15.8284f, 12f, 14.8856f, 12f, 13f)
        verticalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 12f)
        verticalLineTo(22f)
        moveTo(20f, 12f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 6f)
        verticalLineTo(5f)
        curveTo(7f, 3.58579f, 7f, 2.87868f, 7.43934f, 2.43934f)
        curveTo(7.87868f, 2f, 8.58579f, 2f, 10f, 2f)
        horizontalLineTo(14f)
        curveTo(15.4142f, 2f, 16.1213f, 2f, 16.5607f, 2.43934f)
        curveTo(17f, 2.87868f, 17f, 3.58579f, 17f, 5f)
        verticalLineTo(6f)
        curveTo(17f, 7.41421f, 17f, 8.12132f, 16.5607f, 8.56066f)
        curveTo(16.1213f, 9f, 15.4142f, 9f, 14f, 9f)
        horizontalLineTo(10f)
        curveTo(8.58579f, 9f, 7.87868f, 9f, 7.43934f, 8.56066f)
        curveTo(7f, 8.12132f, 7f, 7.41421f, 7f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 9f)
        lineTo(14f, 12f)
        moveTo(10.5f, 9f)
        lineTo(10f, 12f)
        }
        }.build()

        return _computerDesk01!!
    }

private var _computerDesk01: ImageVector? = null
