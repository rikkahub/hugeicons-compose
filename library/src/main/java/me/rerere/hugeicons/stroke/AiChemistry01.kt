package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiChemistry01: ImageVector
    get() {
        if (_aiChemistry01 != null) {
            return _aiChemistry01!!
        }
        _aiChemistry01 = ImageVector.Builder(
            name = "AiChemistry01",
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
        moveTo(13.5f, 18f)
        curveTo(13.5f, 20.2091f, 11.7091f, 22f, 9.5f, 22f)
        curveTo(7.29086f, 22f, 5.5f, 20.2091f, 5.5f, 18f)
        verticalLineTo(2f)
        horizontalLineTo(13.5f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 10.5f)
        lineTo(15.7421f, 11.197f)
        curveTo(15.4039f, 12.111f, 15.2348f, 12.568f, 14.9014f, 12.9014f)
        curveTo(14.568f, 13.2348f, 14.111f, 13.4039f, 13.197f, 13.7421f)
        lineTo(12.5f, 14f)
        lineTo(13.197f, 14.2579f)
        curveTo(14.111f, 14.5961f, 14.568f, 14.7652f, 14.9014f, 15.0986f)
        curveTo(15.2348f, 15.432f, 15.4039f, 15.889f, 15.7421f, 16.803f)
        lineTo(16f, 17.5f)
        lineTo(16.2579f, 16.803f)
        curveTo(16.5961f, 15.889f, 16.7652f, 15.432f, 17.0986f, 15.0986f)
        curveTo(17.432f, 14.7652f, 17.889f, 14.5961f, 18.803f, 14.2579f)
        lineTo(19.5f, 14f)
        lineTo(18.803f, 13.7421f)
        curveTo(17.889f, 13.4039f, 17.432f, 13.2348f, 17.0986f, 12.9014f)
        curveTo(16.7652f, 12.568f, 16.5961f, 12.111f, 16.2579f, 11.197f)
        lineTo(16f, 10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.5f, 2f)
        horizontalLineTo(14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 8f)
        horizontalLineTo(13.5f)
        }
        }.build()

        return _aiChemistry01!!
    }

private var _aiChemistry01: ImageVector? = null
