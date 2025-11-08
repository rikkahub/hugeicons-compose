package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TableLamp01: ImageVector
    get() {
        if (_tableLamp01 != null) {
            return _tableLamp01!!
        }
        _tableLamp01 = ImageVector.Builder(
            name = "TableLamp01",
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
        moveTo(3f, 12f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 17f)
        lineTo(20f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 14.5f)
        lineTo(13f, 14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.386f, 3.35537f)
        curveTo(14.2825f, 3.18589f, 14.1891f, 3.02611f, 14.1062f, 2.87981f)
        curveTo(13.8552f, 2.43706f, 13.7297f, 2.21569f, 13.5302f, 2.10784f)
        curveTo(13.3307f, 2f, 13.0642f, 2f, 12.5312f, 2f)
        horizontalLineTo(11.4688f)
        curveTo(10.9358f, 2f, 10.6693f, 2f, 10.4698f, 2.10784f)
        curveTo(10.2703f, 2.21569f, 10.1448f, 2.43706f, 9.89384f, 2.87981f)
        lineTo(9.89383f, 2.87981f)
        curveTo(9.81091f, 3.02611f, 9.71746f, 3.18589f, 9.61404f, 3.35537f)
        curveTo(8.41287f, 5.32381f, 7.81228f, 6.30803f, 8.05201f, 6.65402f)
        curveTo(8.29175f, 7f, 9.41969f, 7f, 11.6756f, 7f)
        horizontalLineTo(11.6756f)
        horizontalLineTo(12.3244f)
        horizontalLineTo(12.3244f)
        curveTo(14.5803f, 7f, 15.7082f, 7f, 15.948f, 6.65402f)
        curveTo(16.1877f, 6.30803f, 15.5871f, 5.32381f, 14.386f, 3.35537f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 7f)
        verticalLineTo(12f)
        }
        }.build()

        return _tableLamp01!!
    }

private var _tableLamp01: ImageVector? = null
