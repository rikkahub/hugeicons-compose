package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.EquipmentBenchPress: ImageVector
    get() {
        if (_equipmentBenchPress != null) {
            return _equipmentBenchPress!!
        }
        _equipmentBenchPress = ImageVector.Builder(
            name = "EquipmentBenchPress",
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
        moveTo(18f, 3f)
        verticalLineTo(8f)
        moveTo(6f, 3f)
        verticalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 4f)
        verticalLineTo(5.5f)
        moveTo(20.5f, 5.5f)
        verticalLineTo(7f)
        moveTo(20.5f, 5.5f)
        horizontalLineTo(22f)
        moveTo(3.5f, 4f)
        verticalLineTo(5.5f)
        moveTo(3.5f, 5.5f)
        verticalLineTo(7f)
        moveTo(3.5f, 5.5f)
        horizontalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 5.5f)
        lineTo(6f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 5.5f)
        verticalLineTo(10f)
        moveTo(14f, 5.5f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.9517f, 16f)
        horizontalLineTo(5.06243f)
        moveTo(14.2556f, 10f)
        horizontalLineTo(10.2066f)
        curveTo(9.19904f, 10f, 8.82575f, 10.1443f, 8.27172f, 10.9923f)
        lineTo(5.25854f, 15.6043f)
        curveTo(5.07336f, 15.8877f, 5f, 16.1138f, 5f, 16.4581f)
        curveTo(5f, 18.6114f, 5.87314f, 19f, 7.8469f, 19f)
        horizontalLineTo(16.0969f)
        curveTo(18.1334f, 19f, 19f, 18.6165f, 19f, 16.4079f)
        curveTo(19f, 16.1018f, 18.9432f, 15.8986f, 18.7957f, 15.6351f)
        lineTo(16.2591f, 11.1056f)
        curveTo(15.725f, 10.1518f, 15.3409f, 10f, 14.2556f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 19f)
        verticalLineTo(21f)
        moveTo(8f, 19f)
        verticalLineTo(21f)
        }
        }.build()

        return _equipmentBenchPress!!
    }

private var _equipmentBenchPress: ImageVector? = null
