package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Robot01: ImageVector
    get() {
        if (_robot01 != null) {
            return _robot01!!
        }
        _robot01 = ImageVector.Builder(
            name = "Robot01",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12f, 4f)
            verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(20f, 22f)
            curveTo(20f, 17.5817f, 16.4183f, 14f, 12f, 14f)
            curveTo(7.58172f, 14f, 4f, 17.5817f, 4f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(9.375f, 8.25f)
            horizontalLineTo(9.25f)
            moveTo(9.5f, 8.25f)
            curveTo(9.5f, 8.38807f, 9.38807f, 8.5f, 9.25f, 8.5f)
            curveTo(9.11193f, 8.5f, 9f, 8.38807f, 9f, 8.25f)
            curveTo(9f, 8.11193f, 9.11193f, 8f, 9.25f, 8f)
            curveTo(9.38807f, 8f, 9.5f, 8.11193f, 9.5f, 8.25f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14.875f, 8.25f)
            horizontalLineTo(14.75f)
            moveTo(15f, 8.25f)
            curveTo(15f, 8.38807f, 14.8881f, 8.5f, 14.75f, 8.5f)
            curveTo(14.6119f, 8.5f, 14.5f, 8.38807f, 14.5f, 8.25f)
            curveTo(14.5f, 8.11193f, 14.6119f, 8f, 14.75f, 8f)
            curveTo(14.8881f, 8f, 15f, 8.11193f, 15f, 8.25f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(15.1538f, 4f)
            horizontalLineTo(8.84615f)
            curveTo(7.59095f, 4f, 6.96334f, 4f, 6.47397f, 4.22025f)
            curveTo(5.91693f, 4.47095f, 5.47095f, 4.91693f, 5.22025f, 5.47397f)
            curveTo(5f, 5.96334f, 5f, 6.59095f, 5f, 7.84615f)
            curveTo(5f, 9.85448f, 5f, 10.8586f, 5.3524f, 11.6417f)
            curveTo(5.75353f, 12.5329f, 6.46709f, 13.2465f, 7.35835f, 13.6476f)
            curveTo(8.14135f, 14f, 9.14552f, 14f, 11.1538f, 14f)
            horizontalLineTo(12.8462f)
            curveTo(14.8545f, 14f, 15.8586f, 14f, 16.6417f, 13.6476f)
            curveTo(17.5329f, 13.2465f, 18.2465f, 12.5329f, 18.6476f, 11.6417f)
            curveTo(19f, 10.8586f, 19f, 9.85448f, 19f, 7.84615f)
            curveTo(19f, 6.59095f, 19f, 5.96334f, 18.7797f, 5.47397f)
            curveTo(18.529f, 4.91693f, 18.0831f, 4.47095f, 17.526f, 4.22025f)
            curveTo(17.0367f, 4f, 16.4091f, 4f, 15.1538f, 4f)
            close()
        }
        }.build()

        return _robot01!!
    }

private var _robot01: ImageVector? = null
