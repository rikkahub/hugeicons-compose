package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ElectricWire: ImageVector
    get() {
        if (_electricWire != null) {
            return _electricWire!!
        }
        _electricWire = ImageVector.Builder(
            name = "ElectricWire",
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
        moveTo(12f, 21f)
        verticalLineTo(9f)
        horizontalLineTo(10f)
        curveTo(9.05719f, 9f, 8.58579f, 9f, 8.29289f, 9.29289f)
        curveTo(8f, 9.58579f, 8f, 10.0572f, 8f, 11f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 21f)
        verticalLineTo(11f)
        curveTo(16f, 10.0572f, 16f, 9.58579f, 15.7071f, 9.29289f)
        curveTo(15.4142f, 9f, 14.9428f, 9f, 14f, 9f)
        horizontalLineTo(12f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 5f)
        verticalLineTo(9f)
        moveTo(22f, 7f)
        horizontalLineTo(18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 7f)
        horizontalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 9f)
        verticalLineTo(5.9999f)
        curveTo(10f, 5.06808f, 10f, 4.60218f, 9.84776f, 4.23463f)
        curveTo(9.64477f, 3.74458f, 9.25542f, 3.35523f, 8.76537f, 3.15224f)
        curveTo(8.39782f, 3f, 7.93188f, 3f, 7f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 9f)
        verticalLineTo(5.9999f)
        curveTo(14f, 5.06808f, 14f, 4.60218f, 14.1522f, 4.23463f)
        curveTo(14.3552f, 3.74458f, 14.7446f, 3.35523f, 15.2346f, 3.15224f)
        curveTo(15.6022f, 3f, 16.0681f, 3f, 17f, 3f)
        }
        }.build()

        return _electricWire!!
    }

private var _electricWire: ImageVector? = null
